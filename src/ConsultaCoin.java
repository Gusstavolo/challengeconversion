public record ConsultaCoin(String base_code, String target_code, double conversion_result, String time_last_update_utc) {

    @Override
    public String toString() {
        return " "+ base_code +  " " + target_code +  " " + conversion_result +  " " + time_last_update_utc;
    }
}
