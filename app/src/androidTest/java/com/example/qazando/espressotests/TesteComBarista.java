package com.example.qazando.espressotests;

import android.support.test.rule.ActivityTestRule;

import com.example.qazando.espressotests.ui.activity.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickBack;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;

public class TesteComBarista {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void PrimeiroTeste() {
        writeTo(R.id.login_username, "herbert@gmail.com");
        writeTo(R.id.login_password, "senha123");
        clickOn(R.id.login_button);
    }

    @Test
    public void SegundoTeste() {
        assertDisplayed("Bem vindo Novamente");
    }

    @Test
    public void TerceiroTeste() {
        clickOn("CADASTRAR");
        clickBack();
        clickOn(R.id.btn_sign_up_login);
    }

    @Test
    public void QuartoTeste() {
        assertDisplayed("Não tem uma conta?");
    }

}
