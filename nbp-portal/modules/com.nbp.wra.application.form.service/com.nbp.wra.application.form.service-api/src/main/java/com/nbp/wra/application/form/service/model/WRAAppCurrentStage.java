/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WRAAppCurrentStage service. Represents a row in the &quot;nbp_wra_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageImpl"
)
@ProviderType
public interface WRAAppCurrentStage
	extends PersistedModel, WRAAppCurrentStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WRAAppCurrentStage, Long>
		WRA_APP_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<WRAAppCurrentStage, Long>() {

				@Override
				public Long get(WRAAppCurrentStage wraAppCurrentStage) {
					return wraAppCurrentStage.getWraAppCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<WRAAppCurrentStage> getTypeClass() {
					return WRAAppCurrentStage.class;
				}

			};

}