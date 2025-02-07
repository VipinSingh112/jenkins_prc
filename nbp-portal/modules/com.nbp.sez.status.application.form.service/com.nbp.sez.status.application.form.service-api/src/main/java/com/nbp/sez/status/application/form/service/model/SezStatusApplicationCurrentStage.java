/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezStatusApplicationCurrentStage service. Represents a row in the &quot;nbp_sez_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageImpl"
)
@ProviderType
public interface SezStatusApplicationCurrentStage
	extends PersistedModel, SezStatusApplicationCurrentStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusApplicationCurrentStage, Long>
		SEZ_STAGE_ID_ACCESSOR =
			new Accessor<SezStatusApplicationCurrentStage, Long>() {

				@Override
				public Long get(
					SezStatusApplicationCurrentStage
						sezStatusApplicationCurrentStage) {

					return sezStatusApplicationCurrentStage.getSezStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusApplicationCurrentStage> getTypeClass() {
					return SezStatusApplicationCurrentStage.class;
				}

			};

}