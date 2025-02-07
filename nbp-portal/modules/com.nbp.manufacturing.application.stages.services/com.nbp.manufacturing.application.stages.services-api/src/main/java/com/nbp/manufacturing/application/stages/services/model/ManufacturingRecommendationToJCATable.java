/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacturing_rec_jca&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCA
 * @generated
 */
public class ManufacturingRecommendationToJCATable
	extends BaseTable<ManufacturingRecommendationToJCATable> {

	public static final ManufacturingRecommendationToJCATable INSTANCE =
		new ManufacturingRecommendationToJCATable();

	public final Column<ManufacturingRecommendationToJCATable, Long>
		manufacturingJCAId = createColumn(
			"manufacturingJCAId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManufacturingRecommendationToJCATable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, Date> date =
		createColumn("date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, String>
		recommendationToJCA = createColumn(
			"recommendationToJCA", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, String>
		recommendation = createColumn(
			"recommendation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingRecommendationToJCATable, String>
		numberOfMIICInspectors = createColumn(
			"numberOfMIICInspectors", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private ManufacturingRecommendationToJCATable() {
		super(
			"nbp_manufacturing_rec_jca",
			ManufacturingRecommendationToJCATable::new);
	}

}