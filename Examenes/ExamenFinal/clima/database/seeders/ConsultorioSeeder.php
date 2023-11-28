<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class ConsultorioSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        DB::table("consultorio")->insert([
            [
                "id"=>"1",
                "numero"=>"3",
                "piso"=>"12"
            ],
            [
                "id"=>"2",
                "numero"=>"1",
                "piso"=>"13"
            ],
            [
                "id"=>"3",
                "numero"=>"2",
                "piso"=>"54"
            ],
            [
                "id"=>"4",
                "numero"=>"1",
                "piso"=>"32"
            ],
            [
                "id"=>"5",
                "numero"=>"2",
                "piso"=>"2"
            ]
        ]);
    }
}
