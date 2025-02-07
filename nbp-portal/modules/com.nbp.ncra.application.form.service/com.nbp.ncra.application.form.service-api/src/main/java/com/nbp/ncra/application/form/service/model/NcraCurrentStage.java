/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcraCurrentStage service. Represents a row in the &quot;nbp_ncra_current_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageImpl"
)
@ProviderType
public interface NcraCurrentStage
	extends NcraCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcraCurrentStage, Long>
		NCRA_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<NcraCurrentStage, Long>() {

				@Override
				public Long get(NcraCurrentStage ncraCurrentStage) {
					return ncraCurrentStage.getNcraCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcraCurrentStage> getTypeClass() {
					return NcraCurrentStage.class;
				}

			};

}