/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscAppliPreliminationDeteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteLocalService
 * @generated
 */
public class JadscAppliPreliminationDeteLocalServiceWrapper
	implements JadscAppliPreliminationDeteLocalService,
			   ServiceWrapper<JadscAppliPreliminationDeteLocalService> {

	public JadscAppliPreliminationDeteLocalServiceWrapper() {
		this(null);
	}

	public JadscAppliPreliminationDeteLocalServiceWrapper(
		JadscAppliPreliminationDeteLocalService
			jadscAppliPreliminationDeteLocalService) {

		_jadscAppliPreliminationDeteLocalService =
			jadscAppliPreliminationDeteLocalService;
	}

	/**
	 * Adds the jadsc appli prelimination dete to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		addJadscAppliPreliminationDete(
			com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
				jadscAppliPreliminationDete) {

		return _jadscAppliPreliminationDeteLocalService.
			addJadscAppliPreliminationDete(jadscAppliPreliminationDete);
	}

	/**
	 * Creates a new jadsc appli prelimination dete with the primary key. Does not add the jadsc appli prelimination dete to the database.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key for the new jadsc appli prelimination dete
	 * @return the new jadsc appli prelimination dete
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		createJadscAppliPreliminationDete(long jadscAppliPreliminationDeteId) {

		return _jadscAppliPreliminationDeteLocalService.
			createJadscAppliPreliminationDete(jadscAppliPreliminationDeteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreliminationDeteLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc appli prelimination dete from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		deleteJadscAppliPreliminationDete(
			com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
				jadscAppliPreliminationDete) {

		return _jadscAppliPreliminationDeteLocalService.
			deleteJadscAppliPreliminationDete(jadscAppliPreliminationDete);
	}

	/**
	 * Deletes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws PortalException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
			deleteJadscAppliPreliminationDete(
				long jadscAppliPreliminationDeteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreliminationDeteLocalService.
			deleteJadscAppliPreliminationDete(jadscAppliPreliminationDeteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreliminationDeteLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscAppliPreliminationDeteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscAppliPreliminationDeteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscAppliPreliminationDeteLocalService.dynamicQuery();
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

		return _jadscAppliPreliminationDeteLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
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

		return _jadscAppliPreliminationDeteLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
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

		return _jadscAppliPreliminationDeteLocalService.dynamicQuery(
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

		return _jadscAppliPreliminationDeteLocalService.dynamicQueryCount(
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

		return _jadscAppliPreliminationDeteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		fetchJadscAppliPreliminationDete(long jadscAppliPreliminationDeteId) {

		return _jadscAppliPreliminationDeteLocalService.
			fetchJadscAppliPreliminationDete(jadscAppliPreliminationDeteId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscAppliPreliminationDeteLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscAppliPreliminationDeteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws PortalException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
			getJadscAppliPreliminationDete(long jadscAppliPreliminationDeteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreliminationDeteLocalService.
			getJadscAppliPreliminationDete(jadscAppliPreliminationDeteId);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
			getJadscAppliPreliminationDeteByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return _jadscAppliPreliminationDeteLocalService.
			getJadscAppliPreliminationDeteByCI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete>
			getJadscAppliPreliminationDeteByOutcome(String outcome) {

		return _jadscAppliPreliminationDeteLocalService.
			getJadscAppliPreliminationDeteByOutcome(outcome);
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of jadsc appli prelimination detes
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete>
			getJadscAppliPreliminationDetes(int start, int end) {

		return _jadscAppliPreliminationDeteLocalService.
			getJadscAppliPreliminationDetes(start, end);
	}

	/**
	 * Returns the number of jadsc appli prelimination detes.
	 *
	 * @return the number of jadsc appli prelimination detes
	 */
	@Override
	public int getJadscAppliPreliminationDetesCount() {
		return _jadscAppliPreliminationDeteLocalService.
			getJadscAppliPreliminationDetesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliPreliminationDeteLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreliminationDeteLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc appli prelimination dete in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreliminationDeteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		updateJadscAppliPreliminationDete(
			com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
				jadscAppliPreliminationDete) {

		return _jadscAppliPreliminationDeteLocalService.
			updateJadscAppliPreliminationDete(jadscAppliPreliminationDete);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete
		updateJadscAppliPreliminationDete(
			String caseId, java.util.Date dateOfPreDete, String outcome) {

		return _jadscAppliPreliminationDeteLocalService.
			updateJadscAppliPreliminationDete(caseId, dateOfPreDete, outcome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscAppliPreliminationDeteLocalService.getBasePersistence();
	}

	@Override
	public JadscAppliPreliminationDeteLocalService getWrappedService() {
		return _jadscAppliPreliminationDeteLocalService;
	}

	@Override
	public void setWrappedService(
		JadscAppliPreliminationDeteLocalService
			jadscAppliPreliminationDeteLocalService) {

		_jadscAppliPreliminationDeteLocalService =
			jadscAppliPreliminationDeteLocalService;
	}

	private JadscAppliPreliminationDeteLocalService
		_jadscAppliPreliminationDeteLocalService;

}