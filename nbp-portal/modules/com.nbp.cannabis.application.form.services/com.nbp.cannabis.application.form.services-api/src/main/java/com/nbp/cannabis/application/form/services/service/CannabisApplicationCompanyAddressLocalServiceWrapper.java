/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddressLocalService
 * @generated
 */
public class CannabisApplicationCompanyAddressLocalServiceWrapper
	implements CannabisApplicationCompanyAddressLocalService,
			   ServiceWrapper<CannabisApplicationCompanyAddressLocalService> {

	public CannabisApplicationCompanyAddressLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyAddressLocalServiceWrapper(
		CannabisApplicationCompanyAddressLocalService
			cannabisApplicationCompanyAddressLocalService) {

		_cannabisApplicationCompanyAddressLocalService =
			cannabisApplicationCompanyAddressLocalService;
	}

	/**
	 * Adds the cannabis application company address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress addCannabisApplicationCompanyAddress(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplicationCompanyAddress
					cannabisApplicationCompanyAddress) {

		return _cannabisApplicationCompanyAddressLocalService.
			addCannabisApplicationCompanyAddress(
				cannabisApplicationCompanyAddress);
	}

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
			createCannabisApplicationCompanyAddress(long companyAddressId) {

		return _cannabisApplicationCompanyAddressLocalService.
			createCannabisApplicationCompanyAddress(companyAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application company address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
			deleteCannabisApplicationCompanyAddress(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress) {

		return _cannabisApplicationCompanyAddressLocalService.
			deleteCannabisApplicationCompanyAddress(
				cannabisApplicationCompanyAddress);
	}

	/**
	 * Deletes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
				deleteCannabisApplicationCompanyAddress(long companyAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.
			deleteCannabisApplicationCompanyAddress(companyAddressId);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
				deleteCannabisApplicationCompanyAddress(
					String addressType, long companyInformationId)
			throws com.nbp.cannabis.application.form.services.exception.
				NoSuchCannabisApplicationCompanyAddressException {

		return _cannabisApplicationCompanyAddressLocalService.
			deleteCannabisApplicationCompanyAddress(
				addressType, companyInformationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationCompanyAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationCompanyAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationCompanyAddressLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cannabisApplicationCompanyAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _cannabisApplicationCompanyAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _cannabisApplicationCompanyAddressLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cannabisApplicationCompanyAddressLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _cannabisApplicationCompanyAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
			fetchCannabisApplicationCompanyAddress(long companyAddressId) {

		return _cannabisApplicationCompanyAddressLocalService.
			fetchCannabisApplicationCompanyAddress(companyAddressId);
	}

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
			fetchCannabisApplicationCompanyAddressByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationCompanyAddressLocalService.
			fetchCannabisApplicationCompanyAddressByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationCompanyAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress getCA_CA_by_CI_AT(
			String addressType, long companyInformationId) {

		return _cannabisApplicationCompanyAddressLocalService.getCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns the cannabis application company address with the primary key.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress getCannabisApplicationCompanyAddress(
				long companyAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddress(companyAddressId);
	}

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address
	 * @throws PortalException if a matching cannabis application company address could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
				getCannabisApplicationCompanyAddressByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddressByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAddress>
				getCannabisApplicationCompanyAddresses(int start, int end) {

		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddresses(start, end);
	}

	/**
	 * Returns all the cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAddress>
				getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationCompanyAddress>
				getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationCompanyAddress>
								orderByComparator) {

		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
	 */
	@Override
	public int getCannabisApplicationCompanyAddressesCount() {
		return _cannabisApplicationCompanyAddressLocalService.
			getCannabisApplicationCompanyAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationCompanyAddressLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationCompanyAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationCompanyAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application company address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationCompanyAddress
			updateCannabisApplicationCompanyAddress(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationCompanyAddress
						cannabisApplicationCompanyAddress) {

		return _cannabisApplicationCompanyAddressLocalService.
			updateCannabisApplicationCompanyAddress(
				cannabisApplicationCompanyAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationCompanyAddressLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationCompanyAddressLocalService getWrappedService() {
		return _cannabisApplicationCompanyAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyAddressLocalService
			cannabisApplicationCompanyAddressLocalService) {

		_cannabisApplicationCompanyAddressLocalService =
			cannabisApplicationCompanyAddressLocalService;
	}

	private CannabisApplicationCompanyAddressLocalService
		_cannabisApplicationCompanyAddressLocalService;

}