/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link LicenceToAbstractInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfoLocalService
 * @generated
 */
public class LicenceToAbstractInfoLocalServiceWrapper
	implements LicenceToAbstractInfoLocalService,
			   ServiceWrapper<LicenceToAbstractInfoLocalService> {

	public LicenceToAbstractInfoLocalServiceWrapper() {
		this(null);
	}

	public LicenceToAbstractInfoLocalServiceWrapper(
		LicenceToAbstractInfoLocalService licenceToAbstractInfoLocalService) {

		_licenceToAbstractInfoLocalService = licenceToAbstractInfoLocalService;
	}

	/**
	 * Adds the licence to abstract info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
		addLicenceToAbstractInfo(
			com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
				licenceToAbstractInfo) {

		return _licenceToAbstractInfoLocalService.addLicenceToAbstractInfo(
			licenceToAbstractInfo);
	}

	/**
	 * Creates a new licence to abstract info with the primary key. Does not add the licence to abstract info to the database.
	 *
	 * @param abstractLicenceId the primary key for the new licence to abstract info
	 * @return the new licence to abstract info
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
		createLicenceToAbstractInfo(long abstractLicenceId) {

		return _licenceToAbstractInfoLocalService.createLicenceToAbstractInfo(
			abstractLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToAbstractInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the licence to abstract info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
		deleteLicenceToAbstractInfo(
			com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
				licenceToAbstractInfo) {

		return _licenceToAbstractInfoLocalService.deleteLicenceToAbstractInfo(
			licenceToAbstractInfo);
	}

	/**
	 * Deletes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws PortalException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
			deleteLicenceToAbstractInfo(long abstractLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToAbstractInfoLocalService.deleteLicenceToAbstractInfo(
			abstractLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToAbstractInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _licenceToAbstractInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _licenceToAbstractInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _licenceToAbstractInfoLocalService.dynamicQuery();
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

		return _licenceToAbstractInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
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

		return _licenceToAbstractInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
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

		return _licenceToAbstractInfoLocalService.dynamicQuery(
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

		return _licenceToAbstractInfoLocalService.dynamicQueryCount(
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

		return _licenceToAbstractInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
		fetchLicenceToAbstractInfo(long abstractLicenceId) {

		return _licenceToAbstractInfoLocalService.fetchLicenceToAbstractInfo(
			abstractLicenceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _licenceToAbstractInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _licenceToAbstractInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
			getLicenceToAbstract_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return _licenceToAbstractInfoLocalService.getLicenceToAbstract_By_Id(
			wraApplicationId);
	}

	/**
	 * Returns the licence to abstract info with the primary key.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws PortalException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
			getLicenceToAbstractInfo(long abstractLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToAbstractInfoLocalService.getLicenceToAbstractInfo(
			abstractLicenceId);
	}

	/**
	 * Returns a range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @return the range of licence to abstract infos
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.LicenceToAbstractInfo>
			getLicenceToAbstractInfos(int start, int end) {

		return _licenceToAbstractInfoLocalService.getLicenceToAbstractInfos(
			start, end);
	}

	/**
	 * Returns the number of licence to abstract infos.
	 *
	 * @return the number of licence to abstract infos
	 */
	@Override
	public int getLicenceToAbstractInfosCount() {
		return _licenceToAbstractInfoLocalService.
			getLicenceToAbstractInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _licenceToAbstractInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToAbstractInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the licence to abstract info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToAbstractInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 * @return the licence to abstract info that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
		updateLicenceToAbstractInfo(
			com.nbp.wra.application.form.service.model.LicenceToAbstractInfo
				licenceToAbstractInfo) {

		return _licenceToAbstractInfoLocalService.updateLicenceToAbstractInfo(
			licenceToAbstractInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _licenceToAbstractInfoLocalService.getBasePersistence();
	}

	@Override
	public LicenceToAbstractInfoLocalService getWrappedService() {
		return _licenceToAbstractInfoLocalService;
	}

	@Override
	public void setWrappedService(
		LicenceToAbstractInfoLocalService licenceToAbstractInfoLocalService) {

		_licenceToAbstractInfoLocalService = licenceToAbstractInfoLocalService;
	}

	private LicenceToAbstractInfoLocalService
		_licenceToAbstractInfoLocalService;

}