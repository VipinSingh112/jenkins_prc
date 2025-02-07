/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JanaacAppliCurrentStage. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.JanaacAppliCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacAppliCurrentStageLocalService
 * @generated
 */
public class JanaacAppliCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.JanaacAppliCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the janaac appli current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was added
	 */
	public static JanaacAppliCurrentStage addJanaacAppliCurrentStage(
		JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return getService().addJanaacAppliCurrentStage(janaacAppliCurrentStage);
	}

	/**
	 * Creates a new janaac appli current stage with the primary key. Does not add the janaac appli current stage to the database.
	 *
	 * @param janaacAppliCurrentStageId the primary key for the new janaac appli current stage
	 * @return the new janaac appli current stage
	 */
	public static JanaacAppliCurrentStage createJanaacAppliCurrentStage(
		long janaacAppliCurrentStageId) {

		return getService().createJanaacAppliCurrentStage(
			janaacAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the janaac appli current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 */
	public static JanaacAppliCurrentStage deleteJanaacAppliCurrentStage(
		JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return getService().deleteJanaacAppliCurrentStage(
			janaacAppliCurrentStage);
	}

	/**
	 * Deletes the janaac appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 * @throws PortalException if a janaac appli current stage with the primary key could not be found
	 */
	public static JanaacAppliCurrentStage deleteJanaacAppliCurrentStage(
			long janaacAppliCurrentStageId)
		throws PortalException {

		return getService().deleteJanaacAppliCurrentStage(
			janaacAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static JanaacAppliCurrentStage fetchJanaacAppliCurrentStage(
		long janaacAppliCurrentStageId) {

		return getService().fetchJanaacAppliCurrentStage(
			janaacAppliCurrentStageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static JanaacAppliCurrentStage getJanaac_Stage_JAI(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacAppliCurrentStageException {

		return getService().getJanaac_Stage_JAI(janaacApplicationId);
	}

	/**
	 * Returns the janaac appli current stage with the primary key.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage
	 * @throws PortalException if a janaac appli current stage with the primary key could not be found
	 */
	public static JanaacAppliCurrentStage getJanaacAppliCurrentStage(
			long janaacAppliCurrentStageId)
		throws PortalException {

		return getService().getJanaacAppliCurrentStage(
			janaacAppliCurrentStageId);
	}

	/**
	 * Returns a range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @return the range of janaac appli current stages
	 */
	public static List<JanaacAppliCurrentStage> getJanaacAppliCurrentStages(
		int start, int end) {

		return getService().getJanaacAppliCurrentStages(start, end);
	}

	/**
	 * Returns the number of janaac appli current stages.
	 *
	 * @return the number of janaac appli current stages
	 */
	public static int getJanaacAppliCurrentStagesCount() {
		return getService().getJanaacAppliCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the janaac appli current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was updated
	 */
	public static JanaacAppliCurrentStage updateJanaacAppliCurrentStage(
		JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return getService().updateJanaacAppliCurrentStage(
			janaacAppliCurrentStage);
	}

	public static JanaacAppliCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JanaacAppliCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			JanaacAppliCurrentStageLocalServiceUtil.class,
			JanaacAppliCurrentStageLocalService.class);

}