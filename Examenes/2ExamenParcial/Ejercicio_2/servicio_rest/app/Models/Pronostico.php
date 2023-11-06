<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Pronostico extends Model
{
    use HasFactory;
    protected $table = 'pronostico';
    protected $fillable=[
        "id",
        "fecha",
        "temperatura",
        "probabilidad"
    ];
}
