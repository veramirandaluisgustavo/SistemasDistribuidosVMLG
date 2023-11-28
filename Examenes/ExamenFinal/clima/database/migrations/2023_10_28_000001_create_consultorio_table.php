<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    protected $batch = 1;
    public function up(): void
    {
        Schema::create('consultorio', function (Blueprint $table) {
            $table->id();
            $table->String("numero");
            $table->String("piso");
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('consultorio');
    }
};
