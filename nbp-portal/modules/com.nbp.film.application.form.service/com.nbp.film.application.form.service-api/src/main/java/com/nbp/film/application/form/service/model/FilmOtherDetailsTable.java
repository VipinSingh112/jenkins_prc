/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_other_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetails
 * @generated
 */
public class FilmOtherDetailsTable extends BaseTable<FilmOtherDetailsTable> {

	public static final FilmOtherDetailsTable INSTANCE =
		new FilmOtherDetailsTable();

	public final Column<FilmOtherDetailsTable, Long> filmOtherDetailsId =
		createColumn(
			"filmOtherDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmOtherDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> additionalPermits =
		createColumn(
			"additionalPermits", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> additionalOtherPermits =
		createColumn(
			"additionalOtherPermits", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> insurance = createColumn(
		"insurance", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> copyOfInsurance =
		createColumn(
			"copyOfInsurance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String>
		temporaryImportEquipment = createColumn(
			"temporaryImportEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String>
		personnelTravellingEquipment = createColumn(
			"personnelTravellingEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> portOfEntry =
		createColumn(
			"portOfEntry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Date> arrivalDate = createColumn(
		"arrivalDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Date> departureDate =
		createColumn(
			"departureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> flightDetails =
		createColumn(
			"flightDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> shippingCompany =
		createColumn(
			"shippingCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> shippingVesselNo =
		createColumn(
			"shippingVesselNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> customsBroker =
		createColumn(
			"customsBroker", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> brokerEmail =
		createColumn(
			"brokerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> brokerMobile =
		createColumn(
			"brokerMobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> typeOfEquipmentJamaica =
		createColumn(
			"typeOfEquipmentJamaica", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, String> rentalArrangedThrough =
		createColumn(
			"rentalArrangedThrough", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmOtherDetailsTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmOtherDetailsTable() {
		super("nbp_film_other_details", FilmOtherDetailsTable::new);
	}

}