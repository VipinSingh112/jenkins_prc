/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JadscAppliReviewAndValidLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidLocalService
 * @generated
 */
public class JadscAppliReviewAndValidLocalServiceWrapper
	implements JadscAppliReviewAndValidLocalService,
			   ServiceWrapper<JadscAppliReviewAndValidLocalService> {

	public JadscAppliReviewAndValidLocalServiceWrapper() {
		this(null);
	}

	public JadscAppliReviewAndValidLocalServiceWrapper(
		JadscAppliReviewAndValidLocalService
			jadscAppliReviewAndValidLocalService) {

		_jadscAppliReviewAndValidLocalService =
			jadscAppliReviewAndValidLocalService;
	}

	/**
	 * Adds the jadsc appli review and valid to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		addJadscAppliReviewAndValid(
			com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
				jadscAppliReviewAndValid) {

		return _jadscAppliReviewAndValidLocalService.
			addJadscAppliReviewAndValid(jadscAppliReviewAndValid);
	}

	/**
	 * Creates a new jadsc appli review and valid with the primary key. Does not add the jadsc appli review and valid to the database.
	 *
	 * @param jadscAppliReviewAndValidId the primary key for the new jadsc appli review and valid
	 * @return the new jadsc appli review and valid
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		createJadscAppliReviewAndValid(long jadscAppliReviewAndValidId) {

		return _jadscAppliReviewAndValidLocalService.
			createJadscAppliReviewAndValid(jadscAppliReviewAndValidId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliReviewAndValidLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc appli review and valid from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		deleteJadscAppliReviewAndValid(
			com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
				jadscAppliReviewAndValid) {

		return _jadscAppliReviewAndValidLocalService.
			deleteJadscAppliReviewAndValid(jadscAppliReviewAndValid);
	}

	/**
	 * Deletes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws PortalException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
			deleteJadscAppliReviewAndValid(long jadscAppliReviewAndValidId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliReviewAndValidLocalService.
			deleteJadscAppliReviewAndValid(jadscAppliReviewAndValidId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliReviewAndValidLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscAppliReviewAndValidLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscAppliReviewAndValidLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscAppliReviewAndValidLocalService.dynamicQuery();
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

		return _jadscAppliReviewAndValidLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
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

		return _jadscAppliReviewAndValidLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
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

		return _jadscAppliReviewAndValidLocalService.dynamicQuery(
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

		return _jadscAppliReviewAndValidLocalService.dynamicQueryCount(
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

		return _jadscAppliReviewAndValidLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		fetchJadscAppliReviewAndValid(long jadscAppliReviewAndValidId) {

		return _jadscAppliReviewAndValidLocalService.
			fetchJadscAppliReviewAndValid(jadscAppliReviewAndValidId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscAppliReviewAndValidLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscAppliReviewAndValidLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws PortalException if a jadsc appli review and valid with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
			getJadscAppliReviewAndValid(long jadscAppliReviewAndValidId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliReviewAndValidLocalService.
			getJadscAppliReviewAndValid(jadscAppliReviewAndValidId);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
			getJadscAppliReviewAndValidByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return _jadscAppliReviewAndValidLocalService.
			getJadscAppliReviewAndValidByCI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid>
			getJadscAppliReviewAndValidByVersionOfApplication(
				String versionOfApplication) {

		return _jadscAppliReviewAndValidLocalService.
			getJadscAppliReviewAndValidByVersionOfApplication(
				versionOfApplication);
	}

	/**
	 * Returns a range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of jadsc appli review and valids
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid>
			getJadscAppliReviewAndValids(int start, int end) {

		return _jadscAppliReviewAndValidLocalService.
			getJadscAppliReviewAndValids(start, end);
	}

	/**
	 * Returns the number of jadsc appli review and valids.
	 *
	 * @return the number of jadsc appli review and valids
	 */
	@Override
	public int getJadscAppliReviewAndValidsCount() {
		return _jadscAppliReviewAndValidLocalService.
			getJadscAppliReviewAndValidsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliReviewAndValidLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliReviewAndValidLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc appli review and valid in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		updateJadscAppliReviewAndValid(
			com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
				jadscAppliReviewAndValid) {

		return _jadscAppliReviewAndValidLocalService.
			updateJadscAppliReviewAndValid(jadscAppliReviewAndValid);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid
		updateJadscAppliReviewAndValid(
			String caseId, String versionOfApplication, String status) {

		return _jadscAppliReviewAndValidLocalService.
			updateJadscAppliReviewAndValid(
				caseId, versionOfApplication, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscAppliReviewAndValidLocalService.getBasePersistence();
	}

	@Override
	public JadscAppliReviewAndValidLocalService getWrappedService() {
		return _jadscAppliReviewAndValidLocalService;
	}

	@Override
	public void setWrappedService(
		JadscAppliReviewAndValidLocalService
			jadscAppliReviewAndValidLocalService) {

		_jadscAppliReviewAndValidLocalService =
			jadscAppliReviewAndValidLocalService;
	}

	private JadscAppliReviewAndValidLocalService
		_jadscAppliReviewAndValidLocalService;

}