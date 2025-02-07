/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationIndividualAddress. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationIndividualAddressLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressLocalService
 * @generated
 */
public class CannabisApplicationIndividualAddressLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationIndividualAddressLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application individual address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was added
	 */
	public static CannabisApplicationIndividualAddress
		addCannabisApplicationIndividualAddress(
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress) {

		return getService().addCannabisApplicationIndividualAddress(
			cannabisApplicationIndividualAddress);
	}

	/**
	 * Creates a new cannabis application individual address with the primary key. Does not add the cannabis application individual address to the database.
	 *
	 * @param IndividualAddressId the primary key for the new cannabis application individual address
	 * @return the new cannabis application individual address
	 */
	public static CannabisApplicationIndividualAddress
		createCannabisApplicationIndividualAddress(long IndividualAddressId) {

		return getService().createCannabisApplicationIndividualAddress(
			IndividualAddressId);
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
	 * Deletes the cannabis application individual address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 */
	public static CannabisApplicationIndividualAddress
		deleteCannabisApplicationIndividualAddress(
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress) {

		return getService().deleteCannabisApplicationIndividualAddress(
			cannabisApplicationIndividualAddress);
	}

	/**
	 * Deletes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws PortalException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress
			deleteCannabisApplicationIndividualAddress(long IndividualAddressId)
		throws PortalException {

		return getService().deleteCannabisApplicationIndividualAddress(
			IndividualAddressId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
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

	public static CannabisApplicationIndividualAddress
		fetchCannabisApplicationIndividualAddress(long IndividualAddressId) {

		return getService().fetchCannabisApplicationIndividualAddress(
			IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
		fetchCannabisApplicationIndividualAddressByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchCannabisApplicationIndividualAddressByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisApplicationIndividualAddress getCA_CA_by_CI_AT(
		String addressType, long companyInformationId) {

		return getService().getCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns the cannabis application individual address with the primary key.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws PortalException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress
			getCannabisApplicationIndividualAddress(long IndividualAddressId)
		throws PortalException {

		return getService().getCannabisApplicationIndividualAddress(
			IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual address
	 * @throws PortalException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
			getCannabisApplicationIndividualAddressByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getCannabisApplicationIndividualAddressByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress>
		getCannabisApplicationIndividualAddresses(int start, int end) {

		return getService().getCannabisApplicationIndividualAddresses(
			start, end);
	}

	/**
	 * Returns all the cannabis application individual addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual addresses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application individual addresses, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationIndividualAddress>
		getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application individual addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual addresses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application individual addresses, or an empty list if no matches were found
	 */
	public static List<CannabisApplicationIndividualAddress>
		getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator) {

		return getService().
			getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application individual addresses.
	 *
	 * @return the number of cannabis application individual addresses
	 */
	public static int getCannabisApplicationIndividualAddressesCount() {
		return getService().getCannabisApplicationIndividualAddressesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the cannabis application individual address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was updated
	 */
	public static CannabisApplicationIndividualAddress
		updateCannabisApplicationIndividualAddress(
			CannabisApplicationIndividualAddress
				cannabisApplicationIndividualAddress) {

		return getService().updateCannabisApplicationIndividualAddress(
			cannabisApplicationIndividualAddress);
	}

	public static CannabisApplicationIndividualAddressLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<CannabisApplicationIndividualAddressLocalService> _serviceSnapshot =
			new Snapshot<>(
				CannabisApplicationIndividualAddressLocalServiceUtil.class,
				CannabisApplicationIndividualAddressLocalService.class);

}