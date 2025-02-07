/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_recommen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendations
 * @generated
 */
public class OSIServicesRecommendationsTable
	extends BaseTable<OSIServicesRecommendationsTable> {

	public static final OSIServicesRecommendationsTable INSTANCE =
		new OSIServicesRecommendationsTable();

	public final Column<OSIServicesRecommendationsTable, Long>
		oSIServicesRecommendationsId = createColumn(
			"oSIServicesRecommendationsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OSIServicesRecommendationsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, Date>
		dateOfRecommendationsDecision = createColumn(
			"dateOfRecommendationsDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, String>
		recommendationsDecision = createColumn(
			"recommendationsDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OSIServicesRecommendationsTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private OSIServicesRecommendationsTable() {
		super(
			"nbp_osi_services_recommen", OSIServicesRecommendationsTable::new);
	}

}