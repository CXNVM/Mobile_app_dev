package com.example.lab3.ui.theme.lab3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B.\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0015\u0010\u0006\u001a\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR)\u0010\u0006\u001a\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u00a2\u0006\u0002\b\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/lab3/ui/theme/lab3/TabItem;", "", "icon", "", "title", "", "screen", "Lkotlin/Function0;", "", "Lcom/example/lab3/ui/theme/lab3/ComposableFun;", "Landroidx/compose/runtime/Composable;", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "setIcon", "(I)V", "getScreen", "()Lkotlin/jvm/functions/Function0;", "setScreen", "(Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Login", "Register", "Lcom/example/lab3/ui/theme/lab3/TabItem$Login;", "Lcom/example/lab3/ui/theme/lab3/TabItem$Register;", "app_debug"})
public abstract class TabItem {
    private int icon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> screen;
    
    private TabItem(int icon, java.lang.String title, kotlin.jvm.functions.Function0<kotlin.Unit> screen) {
        super();
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getScreen() {
        return null;
    }
    
    public final void setScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/lab3/ui/theme/lab3/TabItem$Login;", "Lcom/example/lab3/ui/theme/lab3/TabItem;", "()V", "app_debug"})
    public static final class Login extends com.example.lab3.ui.theme.lab3.TabItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lab3.ui.theme.lab3.TabItem.Login INSTANCE = null;
        
        private Login() {
            super(0, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/lab3/ui/theme/lab3/TabItem$Register;", "Lcom/example/lab3/ui/theme/lab3/TabItem;", "()V", "app_debug"})
    public static final class Register extends com.example.lab3.ui.theme.lab3.TabItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lab3.ui.theme.lab3.TabItem.Register INSTANCE = null;
        
        private Register() {
            super(0, null, null);
        }
    }
}