/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantPrincipleDirectorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirectorLocalService
 * @generated
 */
public class SezOccupantPrincipleDirectorLocalServiceWrapper
	implements ServiceWrapper<SezOccupantPrincipleDirectorLocalService>,
			   SezOccupantPrincipleDirectorLocalService {

	public SezOccupantPrincipleDirectorLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantPrincipleDirectorLocalServiceWrapper(
		SezOccupantPrincipleDirectorLocalService
			sezOccupantPrincipleDirectorLocalService) {

		_sezOccupantPrincipleDirectorLocalService =
			sezOccupantPrincipleDirectorLocalService;
	}

	/**
	 * Adds the sez occupant principle director to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleDirectorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 * @return the sez occupant principle director that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector addSezOccupantPrincipleDirector(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return _sezOccupantPrincipleDirectorLocalService.
			addSezOccupantPrincipleDirector(sezOccupantPrincipleDirector);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleDirectorLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant principle director with the primary key. Does not add the sez occupant principle director to the database.
	 *
	 * @param sezOccPrincDirectId the primary key for the new sez occupant principle director
	 * @return the new sez occupant principle director
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector createSezOccupantPrincipleDirector(
			long sezOccPrincDirectId) {

		return _sezOccupantPrincipleDirectorLocalService.
			createSezOccupantPrincipleDirector(sezOccPrincDirectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleDirectorLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant principle director with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleDirectorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 * @throws PortalException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector deleteSezOccupantPrincipleDirector(
				long sezOccPrincDirectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleDirectorLocalService.
			deleteSezOccupantPrincipleDirector(sezOccPrincDirectId);
	}

	/**
	 * Deletes the sez occupant principle director from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleDirectorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector deleteSezOccupantPrincipleDirector(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return _sezOccupantPrincipleDirectorLocalService.
			deleteSezOccupantPrincipleDirector(sezOccupantPrincipleDirector);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantPrincipleDirectorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantPrincipleDirectorLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantPrincipleDirectorLocalService.dynamicQuery();
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

		return _sezOccupantPrincipleDirectorLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleDirectorModelImpl</code>.
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

		return _sezOccupantPrincipleDirectorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleDirectorModelImpl</code>.
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

		return _sezOccupantPrincipleDirectorLocalService.dynamicQuery(
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

		return _sezOccupantPrincipleDirectorLocalService.dynamicQueryCount(
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

		return _sezOccupantPrincipleDirectorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector fetchSezOccupantPrincipleDirector(
			long sezOccPrincDirectId) {

		return _sezOccupantPrincipleDirectorLocalService.
			fetchSezOccupantPrincipleDirector(sezOccPrincDirectId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantPrincipleDirectorLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantPrincipleDirectorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantPrincipleDirectorLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleDirectorLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant principle director with the primary key.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director
	 * @throws PortalException if a sez occupant principle director with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector getSezOccupantPrincipleDirector(
				long sezOccPrincDirectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleDirectorLocalService.
			getSezOccupantPrincipleDirector(sezOccPrincDirectId);
	}

	/**
	 * Returns a range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of sez occupant principle directors
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantPrincipleDirector> getSezOccupantPrincipleDirectors(
				int start, int end) {

		return _sezOccupantPrincipleDirectorLocalService.
			getSezOccupantPrincipleDirectors(start, end);
	}

	/**
	 * Returns the number of sez occupant principle directors.
	 *
	 * @return the number of sez occupant principle directors
	 */
	@Override
	public int getSezOccupantPrincipleDirectorsCount() {
		return _sezOccupantPrincipleDirectorLocalService.
			getSezOccupantPrincipleDirectorsCount();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantPrincipleDirector> getSezStatusBy_Id(
				long sezApplicationId) {

		return _sezOccupantPrincipleDirectorLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant principle director in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleDirectorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 * @return the sez occupant principle director that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleDirector updateSezOccupantPrincipleDirector(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return _sezOccupantPrincipleDirectorLocalService.
			updateSezOccupantPrincipleDirector(sezOccupantPrincipleDirector);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantPrincipleDirectorLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantPrincipleDirectorLocalService getWrappedService() {
		return _sezOccupantPrincipleDirectorLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantPrincipleDirectorLocalService
			sezOccupantPrincipleDirectorLocalService) {

		_sezOccupantPrincipleDirectorLocalService =
			sezOccupantPrincipleDirectorLocalService;
	}

	private SezOccupantPrincipleDirectorLocalService
		_sezOccupantPrincipleDirectorLocalService;

}