/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscApplicationPreInitiationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiationLocalService
 * @generated
 */
public class JadscApplicationPreInitiationLocalServiceWrapper
	implements JadscApplicationPreInitiationLocalService,
			   ServiceWrapper<JadscApplicationPreInitiationLocalService> {

	public JadscApplicationPreInitiationLocalServiceWrapper() {
		this(null);
	}

	public JadscApplicationPreInitiationLocalServiceWrapper(
		JadscApplicationPreInitiationLocalService
			jadscApplicationPreInitiationLocalService) {

		_jadscApplicationPreInitiationLocalService =
			jadscApplicationPreInitiationLocalService;
	}

	/**
	 * Adds the jadsc application pre initiation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		addJadscApplicationPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
				jadscApplicationPreInitiation) {

		return _jadscApplicationPreInitiationLocalService.
			addJadscApplicationPreInitiation(jadscApplicationPreInitiation);
	}

	/**
	 * Creates a new jadsc application pre initiation with the primary key. Does not add the jadsc application pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc application pre initiation
	 * @return the new jadsc application pre initiation
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		createJadscApplicationPreInitiation(long jadscAppliPreInitiationId) {

		return _jadscApplicationPreInitiationLocalService.
			createJadscApplicationPreInitiation(jadscAppliPreInitiationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationPreInitiationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc application pre initiation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		deleteJadscApplicationPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
				jadscApplicationPreInitiation) {

		return _jadscApplicationPreInitiationLocalService.
			deleteJadscApplicationPreInitiation(jadscApplicationPreInitiation);
	}

	/**
	 * Deletes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws PortalException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
			deleteJadscApplicationPreInitiation(long jadscAppliPreInitiationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationPreInitiationLocalService.
			deleteJadscApplicationPreInitiation(jadscAppliPreInitiationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationPreInitiationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscApplicationPreInitiationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscApplicationPreInitiationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscApplicationPreInitiationLocalService.dynamicQuery();
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

		return _jadscApplicationPreInitiationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
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

		return _jadscApplicationPreInitiationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
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

		return _jadscApplicationPreInitiationLocalService.dynamicQuery(
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

		return _jadscApplicationPreInitiationLocalService.dynamicQueryCount(
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

		return _jadscApplicationPreInitiationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		fetchJadscApplicationPreInitiation(long jadscAppliPreInitiationId) {

		return _jadscApplicationPreInitiationLocalService.
			fetchJadscApplicationPreInitiation(jadscAppliPreInitiationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscApplicationPreInitiationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscApplicationPreInitiationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws PortalException if a jadsc application pre initiation with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
			getJadscApplicationPreInitiation(long jadscAppliPreInitiationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationPreInitiationLocalService.
			getJadscApplicationPreInitiation(jadscAppliPreInitiationId);
	}

	/**
	 * Returns a range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of jadsc application pre initiations
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation>
			getJadscApplicationPreInitiations(int start, int end) {

		return _jadscApplicationPreInitiationLocalService.
			getJadscApplicationPreInitiations(start, end);
	}

	/**
	 * Returns the number of jadsc application pre initiations.
	 *
	 * @return the number of jadsc application pre initiations
	 */
	@Override
	public int getJadscApplicationPreInitiationsCount() {
		return _jadscApplicationPreInitiationLocalService.
			getJadscApplicationPreInitiationsCount();
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
			getJadscPreInitiationByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return _jadscApplicationPreInitiationLocalService.
			getJadscPreInitiationByCI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation>
			getJadscPreInitiationByOutcome(String outcome) {

		return _jadscApplicationPreInitiationLocalService.
			getJadscPreInitiationByOutcome(outcome);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationPreInitiationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationPreInitiationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc application pre initiation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		updateJadscApplicationPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
				jadscApplicationPreInitiation) {

		return _jadscApplicationPreInitiationLocalService.
			updateJadscApplicationPreInitiation(jadscApplicationPreInitiation);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation
		updateJadscApplicationPreInitiation(
			String caseId, java.util.Date dateOfPreInitiation, String outcome) {

		return _jadscApplicationPreInitiationLocalService.
			updateJadscApplicationPreInitiation(
				caseId, dateOfPreInitiation, outcome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscApplicationPreInitiationLocalService.getBasePersistence();
	}

	@Override
	public JadscApplicationPreInitiationLocalService getWrappedService() {
		return _jadscApplicationPreInitiationLocalService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationPreInitiationLocalService
			jadscApplicationPreInitiationLocalService) {

		_jadscApplicationPreInitiationLocalService =
			jadscApplicationPreInitiationLocalService;
	}

	private JadscApplicationPreInitiationLocalService
		_jadscApplicationPreInitiationLocalService;

}