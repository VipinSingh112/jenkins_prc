/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RadiationSafetyLowRisk. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.RadiationSafetyLowRiskLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRiskLocalService
 * @generated
 */
public class RadiationSafetyLowRiskLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.RadiationSafetyLowRiskLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the radiation safety low risk to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was added
	 */
	public static RadiationSafetyLowRisk addRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return getService().addRadiationSafetyLowRisk(radiationSafetyLowRisk);
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
	 * Creates a new radiation safety low risk with the primary key. Does not add the radiation safety low risk to the database.
	 *
	 * @param radiationSafetyLowRiskId the primary key for the new radiation safety low risk
	 * @return the new radiation safety low risk
	 */
	public static RadiationSafetyLowRisk createRadiationSafetyLowRisk(
		long radiationSafetyLowRiskId) {

		return getService().createRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	public static RadiationSafetyLowRisk deleteRadiationSafetyLowRisk(
			long radiationSafetyLowRiskId)
		throws PortalException {

		return getService().deleteRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	/**
	 * Deletes the radiation safety low risk from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 */
	public static RadiationSafetyLowRisk deleteRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return getService().deleteRadiationSafetyLowRisk(
			radiationSafetyLowRisk);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
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

	public static RadiationSafetyLowRisk fetchRadiationSafetyLowRisk(
		long radiationSafetyLowRiskId) {

		return getService().fetchRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static RadiationSafetyLowRisk getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return getService().getHsraById(hsraApplicationId);
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
	 * Returns the radiation safety low risk with the primary key.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	public static RadiationSafetyLowRisk getRadiationSafetyLowRisk(
			long radiationSafetyLowRiskId)
		throws PortalException {

		return getService().getRadiationSafetyLowRisk(radiationSafetyLowRiskId);
	}

	/**
	 * Returns a range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @return the range of radiation safety low risks
	 */
	public static List<RadiationSafetyLowRisk> getRadiationSafetyLowRisks(
		int start, int end) {

		return getService().getRadiationSafetyLowRisks(start, end);
	}

	/**
	 * Returns the number of radiation safety low risks.
	 *
	 * @return the number of radiation safety low risks
	 */
	public static int getRadiationSafetyLowRisksCount() {
		return getService().getRadiationSafetyLowRisksCount();
	}

	/**
	 * Updates the radiation safety low risk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was updated
	 */
	public static RadiationSafetyLowRisk updateRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return getService().updateRadiationSafetyLowRisk(
			radiationSafetyLowRisk);
	}

	public static RadiationSafetyLowRiskLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<RadiationSafetyLowRiskLocalService>
		_serviceSnapshot = new Snapshot<>(
			RadiationSafetyLowRiskLocalServiceUtil.class,
			RadiationSafetyLowRiskLocalService.class);

}