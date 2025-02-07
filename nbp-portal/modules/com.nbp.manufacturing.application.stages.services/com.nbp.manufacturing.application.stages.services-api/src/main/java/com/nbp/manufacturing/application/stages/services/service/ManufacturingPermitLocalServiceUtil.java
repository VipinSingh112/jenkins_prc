/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManufacturingPermit. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingPermitLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermitLocalService
 * @generated
 */
public class ManufacturingPermitLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingPermitLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manufacturing permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was added
	 */
	public static ManufacturingPermit addManufacturingPermit(
		ManufacturingPermit manufacturingPermit) {

		return getService().addManufacturingPermit(manufacturingPermit);
	}

	/**
	 * Creates a new manufacturing permit with the primary key. Does not add the manufacturing permit to the database.
	 *
	 * @param manufacturingPermitId the primary key for the new manufacturing permit
	 * @return the new manufacturing permit
	 */
	public static ManufacturingPermit createManufacturingPermit(
		long manufacturingPermitId) {

		return getService().createManufacturingPermit(manufacturingPermitId);
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
	 * Deletes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws PortalException if a manufacturing permit with the primary key could not be found
	 */
	public static ManufacturingPermit deleteManufacturingPermit(
			long manufacturingPermitId)
		throws PortalException {

		return getService().deleteManufacturingPermit(manufacturingPermitId);
	}

	/**
	 * Deletes the manufacturing permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was removed
	 */
	public static ManufacturingPermit deleteManufacturingPermit(
		ManufacturingPermit manufacturingPermit) {

		return getService().deleteManufacturingPermit(manufacturingPermit);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
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

	public static ManufacturingPermit fetchManufacturingPermit(
		long manufacturingPermitId) {

		return getService().fetchManufacturingPermit(manufacturingPermitId);
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

	/**
	 * Returns the manufacturing permit with the primary key.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws PortalException if a manufacturing permit with the primary key could not be found
	 */
	public static ManufacturingPermit getManufacturingPermit(
			long manufacturingPermitId)
		throws PortalException {

		return getService().getManufacturingPermit(manufacturingPermitId);
	}

	public static ManufacturingPermit getManufacturingPermitBY_CI(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getService().getManufacturingPermitBY_CI(caseId);
	}

	public static ManufacturingPermit getManufacturingPermitBY_Permit(
			String pirPermitNumber)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getService().getManufacturingPermitBY_Permit(pirPermitNumber);
	}

	public static ManufacturingPermit getManufacturingPermitBY_PermitNumber(
			String pirPermitNumber)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingPermitException {

		return getService().getManufacturingPermitBY_PermitNumber(
			pirPermitNumber);
	}

	/**
	 * Returns a range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @return the range of manufacturing permits
	 */
	public static List<ManufacturingPermit> getManufacturingPermits(
		int start, int end) {

		return getService().getManufacturingPermits(start, end);
	}

	/**
	 * Returns the number of manufacturing permits.
	 *
	 * @return the number of manufacturing permits
	 */
	public static int getManufacturingPermitsCount() {
		return getService().getManufacturingPermitsCount();
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
	 * Updates the manufacturing permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was updated
	 */
	public static ManufacturingPermit updateManufacturingPermit(
		ManufacturingPermit manufacturingPermit) {

		return getService().updateManufacturingPermit(manufacturingPermit);
	}

	public static ManufacturingPermit updateManufacturingPermit(
		String caseId, String pirPermitNumber, java.util.Date dateOfIssue,
		java.util.Date dateOfExpirartion, String durationOfPermit,
		String typeOfPermit, String numberOfExtension, String parish) {

		return getService().updateManufacturingPermit(
			caseId, pirPermitNumber, dateOfIssue, dateOfExpirartion,
			durationOfPermit, typeOfPermit, numberOfExtension, parish);
	}

	public static ManufacturingPermitLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManufacturingPermitLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManufacturingPermitLocalServiceUtil.class,
			ManufacturingPermitLocalService.class);

}