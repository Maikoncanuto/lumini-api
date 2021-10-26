import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {CalculoRequest} from "../../../../core/models/calculo-request.model";

@Component({
  selector: 'app-calculo-request',
  templateUrl: './calculo-request.component.html',
  styleUrls: ['./calculo-request.component.scss']
})
export class CalculoRequestComponent implements OnInit {

  @Output() onCreate: EventEmitter<any> = new EventEmitter<any>();
  @Output() onCancel: EventEmitter<any> = new EventEmitter<any>();

  formGroup!: FormGroup;

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit() {
    this.createForm();
  }

  createForm(): void {
    this.formGroup = this.formBuilder.group({
      valorA: new FormControl(0, [Validators.required, Validators.minLength(1)]),
      valorB: new FormControl(0, [Validators.required, Validators.minLength(1)]),
    });
  }

  create(calculo: CalculoRequest): void {
    this.onCreate.emit(calculo);
  }

  cancel(): void {
    this.onCancel.emit();
  }

  hasErros(controlName: string, errorName: string): any {
    return this.formGroup?.controls[controlName].hasError(errorName);
  }

}
