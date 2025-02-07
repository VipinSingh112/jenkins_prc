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
 * The table class for the &quot;nbp_tourism_bona_gro_tcsign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSign
 * @generated
 */
public class TourismBonaGroundTransContractSignTable
	extends BaseTable<TourismBonaGroundTransContractSignTable> {

	public static final TourismBonaGroundTransContractSignTable INSTANCE =
		new TourismBonaGroundTransContractSignTable();

	public final Column<TourismBonaGroundTransContractSignTable, Long>
		tourismBonaGroTraCoSignId = createColumn(
			"tourismBonaGroTraCoSignId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundTransContractSignTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, String>
		contractType = createColumn(
			"contractType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransContractSignTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundTransContractSignTable() {
		super(
			"nbp_tourism_bona_gro_tcsign",
			TourismBonaGroundTransContractSignTable::new);
	}

}