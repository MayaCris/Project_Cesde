import time
from playwright.sync_api import Playwright, sync_playwright, expect


def run(playwright: Playwright) -> None:
    browser = playwright.chromium.launch(headless=False)
    context = browser.new_context()
    page = context.new_page()
    page.goto("https://app.dataico.com/start/login?_rp_=WyJeICJd&")
    page.get_by_role("textbox").first.click()
    page.get_by_role("textbox").first.fill("")
    page.get_by_test_id("qa.login/password.input").click()
    page.wait_for_load_state("networkidle")
    page.get_by_test_id("qa.login/password.input").fill("")
    page.get_by_role("button", name="Iniciar Sesión").click()
    page.get_by_text("Compras", exact=True).click()
    page.get_by_text("Eventos Recepción").click()
    page.get_by_role("button", name="Ver correos recibidos").click()
    page.locator("img").click()
    page.get_by_text("Agregar Zip").click()
    page.locator("body").set_input_files("96219ad3cd6b5e043610f910a3c35332b2b067bc6b4dd84a5f3daa3362c372c1451db7e66f39e7b3ed41db1b03f25bcf.zip")
    page.get_by_role("button", name="Guardar").click()
    page.locator("img").click()
    page.get_by_text("Agregar Zip").click()
    page.locator("body").set_input_files("230237f90e31ff5305c8a18c03b919f2ad439a8da2a9a28672dd283f7ee8fc6f477ad1b6e0bf053363943c46d79b686c.zip")
    page.get_by_role("button", name="Guardar").click()
    page.locator("img").click()
    page.get_by_text("Agregar Zip").click()
    page.locator("body").set_input_files("406137ae20562cb5bf8d86b42142bda51cd107a73938a3fc772ad1de705393abd9cac4b5ee43e85e51fe109661ba6ca1.zip")
    page.get_by_role("button", name="Guardar").click()
    page.locator("img").click()
    page.get_by_text("Agregar Zip").click()
    page.locator("body").set_input_files("582388d67c2e50da96411cf8ece7faaa4ebed011e68abcfe020f06e961144a49380a7be8a59053bdfcc967dcfd2ffd82.zip")
    page.get_by_role("button", name="Guardar").click()
    page.locator("img").click()
    page.get_by_text("Agregar Zip").click()
    page.locator("body").set_input_files("3202613e3febf8c4d6f3fe1b781481946956c645eada57d7e2e5ad8dcaab4da39cde8a469bdd8b849207522a848f2762.zip")
    page.get_by_role("button", name="Guardar").click()
    
    time.sleep(10)

    # ---------------------
    context.close()
    browser.close()


with sync_playwright() as playwright:
    run(playwright)
