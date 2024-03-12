import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appBorderCard]',
  standalone: true
})
export class BorderCardDirective {

  constructor(private el: ElementRef) { 
    this.setHeight(180);
    this.setBorder(`#f5f5f5`);
  }

  @HostListener('mouseenter') onMouseEnter(){
    this.setBorder('#ffcc80');
  }

  @HostListener('mouseleave') onMouseLeave(){
    this.setBorder('#f5f5f5');
  }

  setHeight(height: number){
    this.el.nativeElement.style.height = `${height}px`
  }

  setBorder(color: string){
    this.el.nativeElement.style.border = `solid 4px ${color}`;
  }

}
