package com.cxmv.lab4.usecases;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/cxmv/lab4/usecases/Validator;", "", "()V", "Companion", "app_debug"})
public final class Validator {
    @org.jetbrains.annotations.NotNull
    public static final com.cxmv.lab4.usecases.Validator.Companion Companion = null;
    
    public Validator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u00a8\u0006\u000f"}, d2 = {"Lcom/cxmv/lab4/usecases/Validator$Companion;", "", "()V", "passwordValidate", "Lcom/cxmv/lab4/types/InputResult;", "password", "", "confirmPassword", "minLength", "", "maxLength", "phoneValidate", "phone", "usernameValidate", "username", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.cxmv.lab4.types.InputResult phoneValidate(@org.jetbrains.annotations.NotNull
        java.lang.String phone) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.cxmv.lab4.types.InputResult passwordValidate(@org.jetbrains.annotations.NotNull
        java.lang.String password, @org.jetbrains.annotations.Nullable
        java.lang.String confirmPassword, int minLength, int maxLength) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.cxmv.lab4.types.InputResult usernameValidate(@org.jetbrains.annotations.NotNull
        java.lang.String username, int minLength, int maxLength) {
            return null;
        }
    }
}