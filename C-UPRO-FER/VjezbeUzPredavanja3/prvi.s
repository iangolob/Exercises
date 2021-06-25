	.file	"prvi.c"
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
	.align 4
LC0:
	.ascii "Upisite visinu (m) iznad povrsine Zemlje > \0"
LC1:
	.ascii "%d\0"
	.align 4
LC4:
	.ascii "gravitacija na visini %d metara je priblizno %e m s(-2)\0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
LFB10:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	andl	$-16, %esp
	subl	$48, %esp
	call	___main
	movl	$LC0, (%esp)
	call	_printf
	leal	36(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$LC1, (%esp)
	call	_scanf
	movl	36(%esp), %eax
	movl	%eax, 28(%esp)
	fildl	28(%esp)
	flds	LC2
	faddp	%st, %st(1)
	fstps	44(%esp)
	flds	44(%esp)
	fmuls	44(%esp)
	flds	LC3
	fdivp	%st, %st(1)
	fstps	40(%esp)
	flds	40(%esp)
	movl	36(%esp), %eax
	fstpl	8(%esp)
	movl	%eax, 4(%esp)
	movl	$LC4, (%esp)
	call	_printf
	movl	$0, %eax
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE10:
	.section .rdata,"dr"
	.align 4
LC2:
	.long	1254255984
	.align 4
LC3:
	.long	1471496683
	.ident	"GCC: (MinGW.org GCC-6.3.0-1) 6.3.0"
	.def	_printf;	.scl	2;	.type	32;	.endef
	.def	_scanf;	.scl	2;	.type	32;	.endef
