/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiComTotalLiability. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiComTotalLiabilityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiabilityLocalService
 * @generated
 */
public class OsiComTotalLiabilityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiComTotalLiabilityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi com total liability to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was added
	 */
	public static OsiComTotalLiability addOsiComTotalLiability(
		OsiComTotalLiability osiComTotalLiability) {

		return getService().addOsiComTotalLiability(osiComTotalLiability);
	}

	/**
	 * Creates a new osi com total liability with the primary key. Does not add the osi com total liability to the database.
	 *
	 * @param osiComTotalLiabilityId the primary key for the new osi com total liability
	 * @return the new osi com total liability
	 */
	public static OsiComTotalLiability createOsiComTotalLiability(
		long osiComTotalLiabilityId) {

		return getService().createOsiComTotalLiability(osiComTotalLiabilityId);
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
	 * Deletes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws PortalException if a osi com total liability with the primary key could not be found
	 */
	public static OsiComTotalLiability deleteOsiComTotalLiability(
			long osiComTotalLiabilityId)
		throws PortalException {

		return getService().deleteOsiComTotalLiability(osiComTotalLiabilityId);
	}

	/**
	 * Deletes the osi com total liability from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was removed
	 */
	public static OsiComTotalLiability deleteOsiComTotalLiability(
		OsiComTotalLiability osiComTotalLiability) {

		return getService().deleteOsiComTotalLiability(osiComTotalLiability);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
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

	public static OsiComTotalLiability fetchOsiComTotalLiability(
		long osiComTotalLiabilityId) {

		return getService().fetchOsiComTotalLiability(osiComTotalLiabilityId);
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

	public static OsiComTotalLiability getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComTotalLiabilityException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @return the range of osi com total liabilities
	 */
	public static List<OsiComTotalLiability> getOsiComTotalLiabilities(
		int start, int end) {

		return getService().getOsiComTotalLiabilities(start, end);
	}

	/**
	 * Returns the number of osi com total liabilities.
	 *
	 * @return the number of osi com total liabilities
	 */
	public static int getOsiComTotalLiabilitiesCount() {
		return getService().getOsiComTotalLiabilitiesCount();
	}

	/**
	 * Returns the osi com total liability with the primary key.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws PortalException if a osi com total liability with the primary key could not be found
	 */
	public static OsiComTotalLiability getOsiComTotalLiability(
			long osiComTotalLiabilityId)
		throws PortalException {

		return getService().getOsiComTotalLiability(osiComTotalLiabilityId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi com total liability in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was updated
	 */
	public static OsiComTotalLiability updateOsiComTotalLiability(
		OsiComTotalLiability osiComTotalLiability) {

		return getService().updateOsiComTotalLiability(osiComTotalLiability);
	}

	public static OsiComTotalLiabilityLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiComTotalLiabilityLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiComTotalLiabilityLocalServiceUtil.class,
			OsiComTotalLiabilityLocalService.class);

}