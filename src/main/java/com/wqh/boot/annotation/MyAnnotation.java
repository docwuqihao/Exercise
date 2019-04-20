package com.wqh.boot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Retention 定义注解生命周期
 * RetentionPolicy 注解的生命周期，Java文件（SOURCE），Class文件(CLASS)，VM内运行(RUNTIME)
 * 1. SOURCE    Annotations are to be discarded by the compiler.
 * 编译成Class文件后消失
 * <p>
 * 2. CLASS     Annotations are to be recorded in the class file by the compiler but
 * need not be retained by the VM at run time.This is the default behavior.
 * Class文件内存在，加载到VM中消失
 * <p>
 * 3. RUNTIME   Annotations are to be recorded in the class file by the compiler and
 * retained by the VM at run time,so they may be read reflectively.
 * VM运行时，依旧存在
 */
@Retention(RetentionPolicy.RUNTIME)

/**
 * @Target 定义注解可用位置
 *  1. TYPE     Class，interface(including annotation type),or enum declaration
 *  2. FIELD    Field declaration(includes enum constants)
 *  3. METHOD
 *  4. PARAMETER
 *  5. CONSTRUCTOR
 *  6. LOCAL_VARIABLE
 *  7. ANNOTATION_TYPE
 *  8. PACKAGE
 *  9. TYPE_PARAMETER   Type parameter declaration
 *  10. TYPE_USE    Use of a type
 */
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE })
public @interface MyAnnotation {

    String field() default "field";

    String value();
}
