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
 * The table class for the &quot;nbp_tourism_bona_ground_ta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddress
 * @generated
 */
public class TourismBonaGroundTransportationAddressTable
	extends BaseTable<TourismBonaGroundTransportationAddressTable> {

	public static final TourismBonaGroundTransportationAddressTable INSTANCE =
		new TourismBonaGroundTransportationAddressTable();

	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		tourismBonaGroundTransAddresId = createColumn(
			"tourismBonaGroundTransAddresId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, String>
		bonaGroundAddress = createColumn(
			"bonaGroundAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationAddressTable, Long>
		tourismBonaGroundTransportId = createColumn(
			"tourismBonaGroundTransportId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundTransportationAddressTable() {
		super(
			"nbp_tourism_bona_ground_ta",
			TourismBonaGroundTransportationAddressTable::new);
	}

}