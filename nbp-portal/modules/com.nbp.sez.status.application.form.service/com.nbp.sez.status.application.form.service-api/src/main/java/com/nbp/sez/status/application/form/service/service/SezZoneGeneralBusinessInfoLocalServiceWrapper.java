/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneGeneralBusinessInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfoLocalService
 * @generated
 */
public class SezZoneGeneralBusinessInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneGeneralBusinessInfoLocalService>,
			   SezZoneGeneralBusinessInfoLocalService {

	public SezZoneGeneralBusinessInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneGeneralBusinessInfoLocalServiceWrapper(
		SezZoneGeneralBusinessInfoLocalService
			sezZoneGeneralBusinessInfoLocalService) {

		_sezZoneGeneralBusinessInfoLocalService =
			sezZoneGeneralBusinessInfoLocalService;
	}

	/**
	 * Adds the sez zone general business info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo addSezZoneGeneralBusinessInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return _sezZoneGeneralBusinessInfoLocalService.
			addSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBusinessInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone general business info with the primary key. Does not add the sez zone general business info to the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key for the new sez zone general business info
	 * @return the new sez zone general business info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo createSezZoneGeneralBusinessInfo(
				long sezZoneGeneralBusinessInfoId) {

		return _sezZoneGeneralBusinessInfoLocalService.
			createSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBusinessInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone general business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info that was removed
	 * @throws PortalException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo deleteSezZoneGeneralBusinessInfo(
					long sezZoneGeneralBusinessInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBusinessInfoLocalService.
			deleteSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Deletes the sez zone general business info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo deleteSezZoneGeneralBusinessInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return _sezZoneGeneralBusinessInfoLocalService.
			deleteSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneGeneralBusinessInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneGeneralBusinessInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneGeneralBusinessInfoLocalService.dynamicQuery();
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

		return _sezZoneGeneralBusinessInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
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

		return _sezZoneGeneralBusinessInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
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

		return _sezZoneGeneralBusinessInfoLocalService.dynamicQuery(
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

		return _sezZoneGeneralBusinessInfoLocalService.dynamicQueryCount(
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

		return _sezZoneGeneralBusinessInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo fetchSezZoneGeneralBusinessInfo(
				long sezZoneGeneralBusinessInfoId) {

		return _sezZoneGeneralBusinessInfoLocalService.
			fetchSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneGeneralBusinessInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneGeneralBusinessInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneGeneralBusinessInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBusinessInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo getSezById(long sezStatusApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezZoneGeneralBusinessInfoException {

		return _sezZoneGeneralBusinessInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone general business info with the primary key.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info
	 * @throws PortalException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo getSezZoneGeneralBusinessInfo(
					long sezZoneGeneralBusinessInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBusinessInfoLocalService.
			getSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Returns a range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @return the range of sez zone general business infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo> getSezZoneGeneralBusinessInfos(
				int start, int end) {

		return _sezZoneGeneralBusinessInfoLocalService.
			getSezZoneGeneralBusinessInfos(start, end);
	}

	/**
	 * Returns the number of sez zone general business infos.
	 *
	 * @return the number of sez zone general business infos
	 */
	@Override
	public int getSezZoneGeneralBusinessInfosCount() {
		return _sezZoneGeneralBusinessInfoLocalService.
			getSezZoneGeneralBusinessInfosCount();
	}

	/**
	 * Updates the sez zone general business info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBusinessInfo updateSezZoneGeneralBusinessInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return _sezZoneGeneralBusinessInfoLocalService.
			updateSezZoneGeneralBusinessInfo(sezZoneGeneralBusinessInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneGeneralBusinessInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneGeneralBusinessInfoLocalService getWrappedService() {
		return _sezZoneGeneralBusinessInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneGeneralBusinessInfoLocalService
			sezZoneGeneralBusinessInfoLocalService) {

		_sezZoneGeneralBusinessInfoLocalService =
			sezZoneGeneralBusinessInfoLocalService;
	}

	private SezZoneGeneralBusinessInfoLocalService
		_sezZoneGeneralBusinessInfoLocalService;

}