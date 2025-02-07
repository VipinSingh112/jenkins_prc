/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiApplicationPermit;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiApplicationPermit. This utility wraps
 * <code>com.nbp.osi.stages.services.service.impl.OsiApplicationPermitLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermitLocalService
 * @generated
 */
public class OsiApplicationPermitLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.stages.services.service.impl.OsiApplicationPermitLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi application permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was added
	 */
	public static OsiApplicationPermit addOsiApplicationPermit(
		OsiApplicationPermit osiApplicationPermit) {

		return getService().addOsiApplicationPermit(osiApplicationPermit);
	}

	/**
	 * Creates a new osi application permit with the primary key. Does not add the osi application permit to the database.
	 *
	 * @param osiApplicationPermitId the primary key for the new osi application permit
	 * @return the new osi application permit
	 */
	public static OsiApplicationPermit createOsiApplicationPermit(
		long osiApplicationPermitId) {

		return getService().createOsiApplicationPermit(osiApplicationPermitId);
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
	 * Deletes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws PortalException if a osi application permit with the primary key could not be found
	 */
	public static OsiApplicationPermit deleteOsiApplicationPermit(
			long osiApplicationPermitId)
		throws PortalException {

		return getService().deleteOsiApplicationPermit(osiApplicationPermitId);
	}

	/**
	 * Deletes the osi application permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was removed
	 */
	public static OsiApplicationPermit deleteOsiApplicationPermit(
		OsiApplicationPermit osiApplicationPermit) {

		return getService().deleteOsiApplicationPermit(osiApplicationPermit);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
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

	public static OsiApplicationPermit fetchOsiApplicationPermit(
		long osiApplicationPermitId) {

		return getService().fetchOsiApplicationPermit(osiApplicationPermitId);
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
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi application permit with the primary key.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws PortalException if a osi application permit with the primary key could not be found
	 */
	public static OsiApplicationPermit getOsiApplicationPermit(
			long osiApplicationPermitId)
		throws PortalException {

		return getService().getOsiApplicationPermit(osiApplicationPermitId);
	}

	/**
	 * Returns a range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @return the range of osi application permits
	 */
	public static List<OsiApplicationPermit> getOsiApplicationPermits(
		int start, int end) {

		return getService().getOsiApplicationPermits(start, end);
	}

	/**
	 * Returns the number of osi application permits.
	 *
	 * @return the number of osi application permits
	 */
	public static int getOsiApplicationPermitsCount() {
		return getService().getOsiApplicationPermitsCount();
	}

	public static OsiApplicationPermit getOsiByCaseId(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationPermitException {

		return getService().getOsiByCaseId(caseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi application permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationPermit the osi application permit
	 * @return the osi application permit that was updated
	 */
	public static OsiApplicationPermit updateOsiApplicationPermit(
		OsiApplicationPermit osiApplicationPermit) {

		return getService().updateOsiApplicationPermit(osiApplicationPermit);
	}

	public static OsiApplicationPermit updateOsiApplicationPermit(
		String caseId, java.util.Date dateOfDecision, String decision,
		java.util.Date issueDate, java.util.Date expiryDate,
		String permitNumber, String fileEntryId) {

		return getService().updateOsiApplicationPermit(
			caseId, dateOfDecision, decision, issueDate, expiryDate,
			permitNumber, fileEntryId);
	}

	public static OsiApplicationPermitLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiApplicationPermitLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiApplicationPermitLocalServiceUtil.class,
			OsiApplicationPermitLocalService.class);

}