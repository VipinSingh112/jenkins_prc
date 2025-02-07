/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JadscApplicationStage service. Represents a row in the &quot;nbp_jadsc_application_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageImpl"
)
@ProviderType
public interface JadscApplicationStage
	extends JadscApplicationStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JadscApplicationStage, Long>
		JADSC_APP_STAGE_ID_ACCESSOR =
			new Accessor<JadscApplicationStage, Long>() {

				@Override
				public Long get(JadscApplicationStage jadscApplicationStage) {
					return jadscApplicationStage.getJadscAppStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JadscApplicationStage> getTypeClass() {
					return JadscApplicationStage.class;
				}

			};

}