/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_bona_attract_ffa&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddress
 * @generated
 */
public class TourismBonaAttractionFormFirstAddressTable
	extends BaseTable<TourismBonaAttractionFormFirstAddressTable> {

	public static final TourismBonaAttractionFormFirstAddressTable INSTANCE =
		new TourismBonaAttractionFormFirstAddressTable();

	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		tourismBonaAttractionFFAOOId = createColumn(
			"tourismBonaAttractionFFAOOId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		bonaAttractAddress = createColumn(
			"bonaAttractAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		bonaAttractionTelephoneNo = createColumn(
			"bonaAttractionTelephoneNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		bonaAttractionFaxNumber = createColumn(
			"bonaAttractionFaxNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, String>
		bonaAttractionEmail = createColumn(
			"bonaAttractionEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstAddressTable, Long>
		tourismBonaAttractFormFirstId = createColumn(
			"tourismBonaAttractFormFirstId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAttractionFormFirstAddressTable() {
		super(
			"nbp_tourism_bona_attract_ffa",
			TourismBonaAttractionFormFirstAddressTable::new);
	}

}