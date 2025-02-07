/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscAppliFinalDeterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeterLocalService
 * @generated
 */
public class JadscAppliFinalDeterLocalServiceWrapper
	implements JadscAppliFinalDeterLocalService,
			   ServiceWrapper<JadscAppliFinalDeterLocalService> {

	public JadscAppliFinalDeterLocalServiceWrapper() {
		this(null);
	}

	public JadscAppliFinalDeterLocalServiceWrapper(
		JadscAppliFinalDeterLocalService jadscAppliFinalDeterLocalService) {

		_jadscAppliFinalDeterLocalService = jadscAppliFinalDeterLocalService;
	}

	/**
	 * Adds the jadsc appli final deter to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliFinalDeterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 * @return the jadsc appli final deter that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		addJadscAppliFinalDeter(
			com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
				jadscAppliFinalDeter) {

		return _jadscAppliFinalDeterLocalService.addJadscAppliFinalDeter(
			jadscAppliFinalDeter);
	}

	/**
	 * Creates a new jadsc appli final deter with the primary key. Does not add the jadsc appli final deter to the database.
	 *
	 * @param jadscAppliFinalDeterId the primary key for the new jadsc appli final deter
	 * @return the new jadsc appli final deter
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		createJadscAppliFinalDeter(long jadscAppliFinalDeterId) {

		return _jadscAppliFinalDeterLocalService.createJadscAppliFinalDeter(
			jadscAppliFinalDeterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliFinalDeterLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc appli final deter from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliFinalDeterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		deleteJadscAppliFinalDeter(
			com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
				jadscAppliFinalDeter) {

		return _jadscAppliFinalDeterLocalService.deleteJadscAppliFinalDeter(
			jadscAppliFinalDeter);
	}

	/**
	 * Deletes the jadsc appli final deter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliFinalDeterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 * @throws PortalException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
			deleteJadscAppliFinalDeter(long jadscAppliFinalDeterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliFinalDeterLocalService.deleteJadscAppliFinalDeter(
			jadscAppliFinalDeterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliFinalDeterLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscAppliFinalDeterLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscAppliFinalDeterLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscAppliFinalDeterLocalService.dynamicQuery();
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

		return _jadscAppliFinalDeterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterModelImpl</code>.
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

		return _jadscAppliFinalDeterLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterModelImpl</code>.
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

		return _jadscAppliFinalDeterLocalService.dynamicQuery(
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

		return _jadscAppliFinalDeterLocalService.dynamicQueryCount(
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

		return _jadscAppliFinalDeterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		fetchJadscAppliFinalDeter(long jadscAppliFinalDeterId) {

		return _jadscAppliFinalDeterLocalService.fetchJadscAppliFinalDeter(
			jadscAppliFinalDeterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscAppliFinalDeterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscAppliFinalDeterLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc appli final deter with the primary key.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter
	 * @throws PortalException if a jadsc appli final deter with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
			getJadscAppliFinalDeter(long jadscAppliFinalDeterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliFinalDeterLocalService.getJadscAppliFinalDeter(
			jadscAppliFinalDeterId);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
			getJadscAppliFinalDeterByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return _jadscAppliFinalDeterLocalService.getJadscAppliFinalDeterByCI(
			caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter>
			getJadscAppliFinalDeterByOutcome(String outcome) {

		return _jadscAppliFinalDeterLocalService.
			getJadscAppliFinalDeterByOutcome(outcome);
	}

	/**
	 * Returns a range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @return the range of jadsc appli final deters
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter>
			getJadscAppliFinalDeters(int start, int end) {

		return _jadscAppliFinalDeterLocalService.getJadscAppliFinalDeters(
			start, end);
	}

	/**
	 * Returns the number of jadsc appli final deters.
	 *
	 * @return the number of jadsc appli final deters
	 */
	@Override
	public int getJadscAppliFinalDetersCount() {
		return _jadscAppliFinalDeterLocalService.
			getJadscAppliFinalDetersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliFinalDeterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliFinalDeterLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc appli final deter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliFinalDeterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 * @return the jadsc appli final deter that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		updateJadscAppliFinalDeter(
			com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
				jadscAppliFinalDeter) {

		return _jadscAppliFinalDeterLocalService.updateJadscAppliFinalDeter(
			jadscAppliFinalDeter);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter
		updateJadscAppliFinalDeter(
			String caseId, java.util.Date dateOfFinalDeter, String outcome) {

		return _jadscAppliFinalDeterLocalService.updateJadscAppliFinalDeter(
			caseId, dateOfFinalDeter, outcome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscAppliFinalDeterLocalService.getBasePersistence();
	}

	@Override
	public JadscAppliFinalDeterLocalService getWrappedService() {
		return _jadscAppliFinalDeterLocalService;
	}

	@Override
	public void setWrappedService(
		JadscAppliFinalDeterLocalService jadscAppliFinalDeterLocalService) {

		_jadscAppliFinalDeterLocalService = jadscAppliFinalDeterLocalService;
	}

	private JadscAppliFinalDeterLocalService _jadscAppliFinalDeterLocalService;

}