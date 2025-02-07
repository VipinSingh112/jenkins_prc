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

import com.nbp.osi.insolvency.application.form.services.model.CompanyFinancialPosition;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CompanyFinancialPosition. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.CompanyFinancialPositionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionLocalService
 * @generated
 */
public class CompanyFinancialPositionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.CompanyFinancialPositionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the company financial position to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was added
	 */
	public static CompanyFinancialPosition addCompanyFinancialPosition(
		CompanyFinancialPosition companyFinancialPosition) {

		return getService().addCompanyFinancialPosition(
			companyFinancialPosition);
	}

	/**
	 * Creates a new company financial position with the primary key. Does not add the company financial position to the database.
	 *
	 * @param companyFinancialPositionId the primary key for the new company financial position
	 * @return the new company financial position
	 */
	public static CompanyFinancialPosition createCompanyFinancialPosition(
		long companyFinancialPositionId) {

		return getService().createCompanyFinancialPosition(
			companyFinancialPositionId);
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
	 * Deletes the company financial position from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was removed
	 */
	public static CompanyFinancialPosition deleteCompanyFinancialPosition(
		CompanyFinancialPosition companyFinancialPosition) {

		return getService().deleteCompanyFinancialPosition(
			companyFinancialPosition);
	}

	/**
	 * Deletes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws PortalException if a company financial position with the primary key could not be found
	 */
	public static CompanyFinancialPosition deleteCompanyFinancialPosition(
			long companyFinancialPositionId)
		throws PortalException {

		return getService().deleteCompanyFinancialPosition(
			companyFinancialPositionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
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

	public static CompanyFinancialPosition fetchCompanyFinancialPosition(
		long companyFinancialPositionId) {

		return getService().fetchCompanyFinancialPosition(
			companyFinancialPositionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the company financial position with the primary key.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position
	 * @throws PortalException if a company financial position with the primary key could not be found
	 */
	public static CompanyFinancialPosition getCompanyFinancialPosition(
			long companyFinancialPositionId)
		throws PortalException {

		return getService().getCompanyFinancialPosition(
			companyFinancialPositionId);
	}

	/**
	 * Returns a range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @return the range of company financial positions
	 */
	public static List<CompanyFinancialPosition> getCompanyFinancialPositions(
		int start, int end) {

		return getService().getCompanyFinancialPositions(start, end);
	}

	/**
	 * Returns the number of company financial positions.
	 *
	 * @return the number of company financial positions
	 */
	public static int getCompanyFinancialPositionsCount() {
		return getService().getCompanyFinancialPositionsCount();
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

	public static CompanyFinancialPosition getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyFinancialPositionException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the company financial position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was updated
	 */
	public static CompanyFinancialPosition updateCompanyFinancialPosition(
		CompanyFinancialPosition companyFinancialPosition) {

		return getService().updateCompanyFinancialPosition(
			companyFinancialPosition);
	}

	public static CompanyFinancialPositionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CompanyFinancialPositionLocalService>
		_serviceSnapshot = new Snapshot<>(
			CompanyFinancialPositionLocalServiceUtil.class,
			CompanyFinancialPositionLocalService.class);

}