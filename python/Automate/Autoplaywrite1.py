import time

from playwright.sync_api import Playwright, sync_playwright, expect


def run(playwright: Playwright) -> None:
    browser = playwright.chromium.launch(headless=False)
    context = browser.new_context()
    page = context.new_page()
    page.goto("https://www.dian.gov.co/")
    with page.expect_popup() as page1_info:
        page.locator("#sliderHInner").get_by_role("link", name="Usuario Registrado").click()
    page1 = page1_info.value
    page1.locator("#mat-select-0 div").nth(2).click()
    page1.get_by_role("option", name="Cédula de ciudadanía").click()
    page1.get_by_placeholder("Escriba el número de documento").click()
    page1.get_by_placeholder("Escriba el número de documento").fill("1035862436")
    page1.get_by_placeholder("Escriba la contraseña").click()
    page1.get_by_placeholder("Escriba la contraseña").click()
    page1.get_by_placeholder("Escriba la contraseña").fill("HelenMaya3110@")
    page1.locator("#mat-checkbox-1 div").first.click()
    page1.get_by_role("button", name="Ingresar").click()

    time.sleep(10)
    # ---------------------
    context.close()
    browser.close()


with sync_playwright() as playwright:
    run(playwright)
