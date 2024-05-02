public record ConsultaCoin(String base_code, String target_code, double conversion_result, String time_last_update_utc) {

    @Override
    public String toString() {
        return base_code +  "⇄" + target_code +  " Corresponde ao valor ► " + conversion_result + "▸"+ target_code + "◂" + "  Ultima atualização da cota ► " + time_last_update_utc;
    }
}
