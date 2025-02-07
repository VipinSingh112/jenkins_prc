/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesRegstCurrentStage. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesRegstCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStageLocalService
 * @generated
 */
public class FactoriesRegstCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesRegstCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories regst current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was added
	 */
	public static FactoriesRegstCurrentStage addFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return getService().addFactoriesRegstCurrentStage(
			factoriesRegstCurrentStage);
	}

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	public static FactoriesRegstCurrentStage createFactoriesRegstCurrentStage(
		long factoriesCurrentStageId) {

		return getService().createFactoriesRegstCurrentStage(
			factoriesCurrentStageId);
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
	 * Deletes the factories regst current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was removed
	 */
	public static FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return getService().deleteFactoriesRegstCurrentStage(
			factoriesRegstCurrentStage);
	}

	/**
	 * Deletes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
			long factoriesCurrentStageId)
		throws PortalException {

		return getService().deleteFactoriesRegstCurrentStage(
			factoriesCurrentStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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

	public static FactoriesRegstCurrentStage fetchFactoriesRegstCurrentStage(
		long factoriesCurrentStageId) {

		return getService().fetchFactoriesRegstCurrentStage(
			factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage
		fetchFactoriesRegstCurrentStageByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchFactoriesRegstCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FactoriesRegstCurrentStage getByFactories_Stage(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getService().getByFactories_Stage(factoriesApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the factories regst current stage with the primary key.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage getFactoriesRegstCurrentStage(
			long factoriesCurrentStageId)
		throws PortalException {

		return getService().getFactoriesRegstCurrentStage(
			factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage
	 * @throws PortalException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage
			getFactoriesRegstCurrentStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getFactoriesRegstCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage>
		getFactoriesRegstCurrentStages(int start, int end) {

		return getService().getFactoriesRegstCurrentStages(start, end);
	}

	/**
	 * Returns all the factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @return the matching factories regst current stages, or an empty list if no matches were found
	 */
	public static List<FactoriesRegstCurrentStage>
		getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching factories regst current stages, or an empty list if no matches were found
	 */
	public static List<FactoriesRegstCurrentStage>
		getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getService().getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
	 */
	public static int getFactoriesRegstCurrentStagesCount() {
		return getService().getFactoriesRegstCurrentStagesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * Updates the factories regst current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was updated
	 */
	public static FactoriesRegstCurrentStage updateFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return getService().updateFactoriesRegstCurrentStage(
			factoriesRegstCurrentStage);
	}

	public static FactoriesRegstCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesRegstCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesRegstCurrentStageLocalServiceUtil.class,
			FactoriesRegstCurrentStageLocalService.class);

}