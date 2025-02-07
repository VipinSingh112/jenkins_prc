/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthCarePermitException;
import com.nbp.healthcare.stage.service.model.HealthCarePermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitUtil
 * @generated
 */
@ProviderType
public interface HealthCarePermitPersistence
	extends BasePersistence<HealthCarePermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCarePermitUtil} to access the health care permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care permit where caseId = &#63; or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit
	 * @throws NoSuchHealthCarePermitException if a matching health care permit could not be found
	 */
	public HealthCarePermit findBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCarePermitException;

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	public HealthCarePermit fetchBygetHealthCareBY_CI(String caseId);

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	public HealthCarePermit fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the health care permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care permit that was removed
	 */
	public HealthCarePermit removeBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCarePermitException;

	/**
	 * Returns the number of health care permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care permits
	 */
	public int countBygetHealthCareBY_CI(String caseId);

	/**
	 * Caches the health care permit in the entity cache if it is enabled.
	 *
	 * @param healthCarePermit the health care permit
	 */
	public void cacheResult(HealthCarePermit healthCarePermit);

	/**
	 * Caches the health care permits in the entity cache if it is enabled.
	 *
	 * @param healthCarePermits the health care permits
	 */
	public void cacheResult(java.util.List<HealthCarePermit> healthCarePermits);

	/**
	 * Creates a new health care permit with the primary key. Does not add the health care permit to the database.
	 *
	 * @param healthPermitId the primary key for the new health care permit
	 * @return the new health care permit
	 */
	public HealthCarePermit create(long healthPermitId);

	/**
	 * Removes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	public HealthCarePermit remove(long healthPermitId)
		throws NoSuchHealthCarePermitException;

	public HealthCarePermit updateImpl(HealthCarePermit healthCarePermit);

	/**
	 * Returns the health care permit with the primary key or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	public HealthCarePermit findByPrimaryKey(long healthPermitId)
		throws NoSuchHealthCarePermitException;

	/**
	 * Returns the health care permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit, or <code>null</code> if a health care permit with the primary key could not be found
	 */
	public HealthCarePermit fetchByPrimaryKey(long healthPermitId);

	/**
	 * Returns all the health care permits.
	 *
	 * @return the health care permits
	 */
	public java.util.List<HealthCarePermit> findAll();

	/**
	 * Returns a range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @return the range of health care permits
	 */
	public java.util.List<HealthCarePermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care permits
	 */
	public java.util.List<HealthCarePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCarePermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care permits
	 */
	public java.util.List<HealthCarePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCarePermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care permits.
	 *
	 * @return the number of health care permits
	 */
	public int countAll();

}