/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyDetailsAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddressLocalService
 * @generated
 */
public class CreativeCompanyDetailsAddressLocalServiceWrapper
	implements CreativeCompanyDetailsAddressLocalService,
			   ServiceWrapper<CreativeCompanyDetailsAddressLocalService> {

	public CreativeCompanyDetailsAddressLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDetailsAddressLocalServiceWrapper(
		CreativeCompanyDetailsAddressLocalService
			creativeCompanyDetailsAddressLocalService) {

		_creativeCompanyDetailsAddressLocalService =
			creativeCompanyDetailsAddressLocalService;
	}

	/**
	 * Adds the creative company details address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 * @return the creative company details address that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress addCreativeCompanyDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return _creativeCompanyDetailsAddressLocalService.
			addCreativeCompanyDetailsAddress(creativeCompanyDetailsAddress);
	}

	/**
	 * Creates a new creative company details address with the primary key. Does not add the creative company details address to the database.
	 *
	 * @param creativeComDetailsAddressId the primary key for the new creative company details address
	 * @return the new creative company details address
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress createCreativeCompanyDetailsAddress(
			long creativeComDetailsAddressId) {

		return _creativeCompanyDetailsAddressLocalService.
			createCreativeCompanyDetailsAddress(creativeComDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative company details address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 * @return the creative company details address that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress deleteCreativeCompanyDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return _creativeCompanyDetailsAddressLocalService.
			deleteCreativeCompanyDetailsAddress(creativeCompanyDetailsAddress);
	}

	/**
	 * Deletes the creative company details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address that was removed
	 * @throws PortalException if a creative company details address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress deleteCreativeCompanyDetailsAddress(
				long creativeComDetailsAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsAddressLocalService.
			deleteCreativeCompanyDetailsAddress(creativeComDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyDetailsAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyDetailsAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyDetailsAddressLocalService.dynamicQuery();
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

		return _creativeCompanyDetailsAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressModelImpl</code>.
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

		return _creativeCompanyDetailsAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressModelImpl</code>.
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

		return _creativeCompanyDetailsAddressLocalService.dynamicQuery(
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

		return _creativeCompanyDetailsAddressLocalService.dynamicQueryCount(
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

		return _creativeCompanyDetailsAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress fetchCreativeCompanyDetailsAddress(
			long creativeComDetailsAddressId) {

		return _creativeCompanyDetailsAddressLocalService.
			fetchCreativeCompanyDetailsAddress(creativeComDetailsAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyDetailsAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress getCreative_Com_Detail_AT(
				String addressType, long creativeCompanyDetailsId)
			throws com.nbp.creative.application.form.service.exception.
				NoSuchCreativeCompanyDetailsAddressException {

		return _creativeCompanyDetailsAddressLocalService.
			getCreative_Com_Detail_AT(addressType, creativeCompanyDetailsId);
	}

	/**
	 * Returns the creative company details address with the primary key.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address
	 * @throws PortalException if a creative company details address with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress getCreativeCompanyDetailsAddress(
				long creativeComDetailsAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsAddressLocalService.
			getCreativeCompanyDetailsAddress(creativeComDetailsAddressId);
	}

	/**
	 * Returns a range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @return the range of creative company details addresses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyDetailsAddress> getCreativeCompanyDetailsAddresses(
				int start, int end) {

		return _creativeCompanyDetailsAddressLocalService.
			getCreativeCompanyDetailsAddresses(start, end);
	}

	/**
	 * Returns the number of creative company details addresses.
	 *
	 * @return the number of creative company details addresses
	 */
	@Override
	public int getCreativeCompanyDetailsAddressesCount() {
		return _creativeCompanyDetailsAddressLocalService.
			getCreativeCompanyDetailsAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyDetailsAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDetailsAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative company details address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 * @return the creative company details address that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDetailsAddress updateCreativeCompanyDetailsAddress(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return _creativeCompanyDetailsAddressLocalService.
			updateCreativeCompanyDetailsAddress(creativeCompanyDetailsAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyDetailsAddressLocalService.getBasePersistence();
	}

	@Override
	public CreativeCompanyDetailsAddressLocalService getWrappedService() {
		return _creativeCompanyDetailsAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDetailsAddressLocalService
			creativeCompanyDetailsAddressLocalService) {

		_creativeCompanyDetailsAddressLocalService =
			creativeCompanyDetailsAddressLocalService;
	}

	private CreativeCompanyDetailsAddressLocalService
		_creativeCompanyDetailsAddressLocalService;

}