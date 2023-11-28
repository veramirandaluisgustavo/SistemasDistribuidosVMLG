<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class ColaSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        DB::table("cola")->insert([
            [
                "id"=>"1",
                "medico_id"=>"1",
                "consultorio_id"=>"1",
                "limite"=>"5"
            ],
            [
                "id"=>"2",
                "medico_id"=>"2",
                "consultorio_id"=>"2",
                "limite"=>"4"
            ],
            [
                "id"=>"3",
                "medico_id"=>"3",
                "consultorio_id"=>"3",
                "limite"=>"7"
            ],
            [
                "id"=>"4",
                "medico_id"=>"4",
                "consultorio_id"=>"4",
                "limite"=>"5"
            ],
            [
                "id"=>"5",
                "medico_id"=>"5",
                "consultorio_id"=>"5",
                "limite"=>"2"
            ],
        ]);
    }
}
