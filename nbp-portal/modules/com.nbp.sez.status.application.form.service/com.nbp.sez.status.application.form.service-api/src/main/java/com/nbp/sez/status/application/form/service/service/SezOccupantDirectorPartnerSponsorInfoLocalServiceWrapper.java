/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantDirectorPartnerSponsorInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfoLocalService
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoLocalServiceWrapper
	implements ServiceWrapper
		<SezOccupantDirectorPartnerSponsorInfoLocalService>,
			   SezOccupantDirectorPartnerSponsorInfoLocalService {

	public SezOccupantDirectorPartnerSponsorInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantDirectorPartnerSponsorInfoLocalServiceWrapper(
		SezOccupantDirectorPartnerSponsorInfoLocalService
			sezOccupantDirectorPartnerSponsorInfoLocalService) {

		_sezOccupantDirectorPartnerSponsorInfoLocalService =
			sezOccupantDirectorPartnerSponsorInfoLocalService;
	}

	/**
	 * Adds the sez occupant director partner sponsor info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
			addSezOccupantDirectorPartnerSponsorInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantDirectorPartnerSponsorInfo
						sezOccupantDirectorPartnerSponsorInfo) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			addSezOccupantDirectorPartnerSponsorInfo(
				sezOccupantDirectorPartnerSponsorInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant director partner sponsor info with the primary key. Does not add the sez occupant director partner sponsor info to the database.
	 *
	 * @param sezOccDirectSpoId the primary key for the new sez occupant director partner sponsor info
	 * @return the new sez occupant director partner sponsor info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
			createSezOccupantDirectorPartnerSponsorInfo(
				long sezOccDirectSpoId) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			createSezOccupantDirectorPartnerSponsorInfo(sezOccDirectSpoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez occupant director partner sponsor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 * @throws PortalException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
				deleteSezOccupantDirectorPartnerSponsorInfo(
					long sezOccDirectSpoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			deleteSezOccupantDirectorPartnerSponsorInfo(sezOccDirectSpoId);
	}

	/**
	 * Deletes the sez occupant director partner sponsor info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
			deleteSezOccupantDirectorPartnerSponsorInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantDirectorPartnerSponsorInfo
						sezOccupantDirectorPartnerSponsorInfo) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			deleteSezOccupantDirectorPartnerSponsorInfo(
				sezOccupantDirectorPartnerSponsorInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantDirectorPartnerSponsorInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			dynamicQuery();
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

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
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

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
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

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.dynamicQuery(
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

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
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

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
			fetchSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			fetchSezOccupantDirectorPartnerSponsorInfo(sezOccDirectSpoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info
	 * @throws PortalException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
				getSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getSezOccupantDirectorPartnerSponsorInfo(sezOccDirectSpoId);
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of sez occupant director partner sponsor infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantDirectorPartnerSponsorInfo>
				getSezOccupantDirectorPartnerSponsorInfos(int start, int end) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getSezOccupantDirectorPartnerSponsorInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos.
	 *
	 * @return the number of sez occupant director partner sponsor infos
	 */
	@Override
	public int getSezOccupantDirectorPartnerSponsorInfosCount() {
		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getSezOccupantDirectorPartnerSponsorInfosCount();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantDirectorPartnerSponsorInfo> getSezStatusBy_Id(
				long sezApplicationId) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant director partner sponsor info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantDirectorPartnerSponsorInfo
			updateSezOccupantDirectorPartnerSponsorInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantDirectorPartnerSponsorInfo
						sezOccupantDirectorPartnerSponsorInfo) {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			updateSezOccupantDirectorPartnerSponsorInfo(
				sezOccupantDirectorPartnerSponsorInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantDirectorPartnerSponsorInfoLocalService.
			getBasePersistence();
	}

	@Override
	public SezOccupantDirectorPartnerSponsorInfoLocalService
		getWrappedService() {

		return _sezOccupantDirectorPartnerSponsorInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantDirectorPartnerSponsorInfoLocalService
			sezOccupantDirectorPartnerSponsorInfoLocalService) {

		_sezOccupantDirectorPartnerSponsorInfoLocalService =
			sezOccupantDirectorPartnerSponsorInfoLocalService;
	}

	private SezOccupantDirectorPartnerSponsorInfoLocalService
		_sezOccupantDirectorPartnerSponsorInfoLocalService;

}