/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WraApplicationStage service. Represents a row in the &quot;nbp_wra_stage_services&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.stage.service.model.impl.WraApplicationStageImpl"
)
@ProviderType
public interface WraApplicationStage
	extends PersistedModel, WraApplicationStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WraApplicationStage, Long>
		WRA_APPLICATION_STAGE_ID_ACCESSOR =
			new Accessor<WraApplicationStage, Long>() {

				@Override
				public Long get(WraApplicationStage wraApplicationStage) {
					return wraApplicationStage.getWraApplicationStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<WraApplicationStage> getTypeClass() {
					return WraApplicationStage.class;
				}

			};

}