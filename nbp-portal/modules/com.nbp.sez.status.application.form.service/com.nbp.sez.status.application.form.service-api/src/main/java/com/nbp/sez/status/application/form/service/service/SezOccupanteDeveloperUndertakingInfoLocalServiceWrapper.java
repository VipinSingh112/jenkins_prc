/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupanteDeveloperUndertakingInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteDeveloperUndertakingInfoLocalService
 * @generated
 */
public class SezOccupanteDeveloperUndertakingInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupanteDeveloperUndertakingInfoLocalService>,
			   SezOccupanteDeveloperUndertakingInfoLocalService {

	public SezOccupanteDeveloperUndertakingInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupanteDeveloperUndertakingInfoLocalServiceWrapper(
		SezOccupanteDeveloperUndertakingInfoLocalService
			sezOccupanteDeveloperUndertakingInfoLocalService) {

		_sezOccupanteDeveloperUndertakingInfoLocalService =
			sezOccupanteDeveloperUndertakingInfoLocalService;
	}

	/**
	 * Adds the sez occupante developer undertaking info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteDeveloperUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
			addSezOccupanteDeveloperUndertakingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteDeveloperUndertakingInfo
						sezOccupanteDeveloperUndertakingInfo) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			addSezOccupanteDeveloperUndertakingInfo(
				sezOccupanteDeveloperUndertakingInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupante developer undertaking info with the primary key. Does not add the sez occupante developer undertaking info to the database.
	 *
	 * @param sezOccDevUnderId the primary key for the new sez occupante developer undertaking info
	 * @return the new sez occupante developer undertaking info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
			createSezOccupanteDeveloperUndertakingInfo(long sezOccDevUnderId) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			createSezOccupanteDeveloperUndertakingInfo(sezOccDevUnderId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupante developer undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteDeveloperUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 * @throws PortalException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
				deleteSezOccupanteDeveloperUndertakingInfo(
					long sezOccDevUnderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			deleteSezOccupanteDeveloperUndertakingInfo(sezOccDevUnderId);
	}

	/**
	 * Deletes the sez occupante developer undertaking info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteDeveloperUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
			deleteSezOccupanteDeveloperUndertakingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteDeveloperUndertakingInfo
						sezOccupanteDeveloperUndertakingInfo) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			deleteSezOccupanteDeveloperUndertakingInfo(
				sezOccupanteDeveloperUndertakingInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupanteDeveloperUndertakingInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupanteDeveloperUndertakingInfoLocalService.dynamicQuery();
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

		return _sezOccupanteDeveloperUndertakingInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
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

		return _sezOccupanteDeveloperUndertakingInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
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

		return _sezOccupanteDeveloperUndertakingInfoLocalService.dynamicQuery(
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

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
			fetchSezOccupanteDeveloperUndertakingInfo(long sezOccDevUnderId) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			fetchSezOccupanteDeveloperUndertakingInfo(sezOccDevUnderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info
	 * @throws PortalException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
				getSezOccupanteDeveloperUndertakingInfo(long sezOccDevUnderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getSezOccupanteDeveloperUndertakingInfo(sezOccDevUnderId);
	}

	/**
	 * Returns a range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @return the range of sez occupante developer undertaking infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupanteDeveloperUndertakingInfo>
				getSezOccupanteDeveloperUndertakingInfos(int start, int end) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getSezOccupanteDeveloperUndertakingInfos(start, end);
	}

	/**
	 * Returns the number of sez occupante developer undertaking infos.
	 *
	 * @return the number of sez occupante developer undertaking infos
	 */
	@Override
	public int getSezOccupanteDeveloperUndertakingInfosCount() {
		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getSezOccupanteDeveloperUndertakingInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo getSezStatusBy_Id(
				long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupante developer undertaking info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupanteDeveloperUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupanteDeveloperUndertakingInfo
			updateSezOccupanteDeveloperUndertakingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupanteDeveloperUndertakingInfo
						sezOccupanteDeveloperUndertakingInfo) {

		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			updateSezOccupanteDeveloperUndertakingInfo(
				sezOccupanteDeveloperUndertakingInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupanteDeveloperUndertakingInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupanteDeveloperUndertakingInfoLocalService
		getWrappedService() {

		return _sezOccupanteDeveloperUndertakingInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupanteDeveloperUndertakingInfoLocalService
			sezOccupanteDeveloperUndertakingInfoLocalService) {

		_sezOccupanteDeveloperUndertakingInfoLocalService =
			sezOccupanteDeveloperUndertakingInfoLocalService;
	}

	private SezOccupanteDeveloperUndertakingInfoLocalService
		_sezOccupanteDeveloperUndertakingInfoLocalService;

}