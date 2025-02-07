/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthCareDueDiligenceException;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface HealthCareDueDiligencePersistence
	extends BasePersistence<HealthCareDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareDueDiligenceUtil} to access the health care due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care due diligence where caseId = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence findBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI(String caseId);

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the health care due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care due diligence that was removed
	 */
	public HealthCareDueDiligence removeBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the number of health care due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care due diligences
	 */
	public int countBygetHealthCareBY_CI(String caseId);

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence findBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency);

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency, boolean useFinderCache);

	/**
	 * Removes the health care due diligence where caseId = &#63; and nameofAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the health care due diligence that was removed
	 */
	public HealthCareDueDiligence removeBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the number of health care due diligences where caseId = &#63; and nameofAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the number of matching health care due diligences
	 */
	public int countBygetHealthCareBY_CI_AN(String caseId, String nameofAgency);

	/**
	 * Caches the health care due diligence in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 */
	public void cacheResult(HealthCareDueDiligence healthCareDueDiligence);

	/**
	 * Caches the health care due diligences in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligences the health care due diligences
	 */
	public void cacheResult(
		java.util.List<HealthCareDueDiligence> healthCareDueDiligences);

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	public HealthCareDueDiligence create(long healthDDId);

	/**
	 * Removes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	public HealthCareDueDiligence remove(long healthDDId)
		throws NoSuchHealthCareDueDiligenceException;

	public HealthCareDueDiligence updateImpl(
		HealthCareDueDiligence healthCareDueDiligence);

	/**
	 * Returns the health care due diligence with the primary key or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	public HealthCareDueDiligence findByPrimaryKey(long healthDDId)
		throws NoSuchHealthCareDueDiligenceException;

	/**
	 * Returns the health care due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence, or <code>null</code> if a health care due diligence with the primary key could not be found
	 */
	public HealthCareDueDiligence fetchByPrimaryKey(long healthDDId);

	/**
	 * Returns all the health care due diligences.
	 *
	 * @return the health care due diligences
	 */
	public java.util.List<HealthCareDueDiligence> findAll();

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	public java.util.List<HealthCareDueDiligence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care due diligences
	 */
	public java.util.List<HealthCareDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareDueDiligence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care due diligences
	 */
	public java.util.List<HealthCareDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareDueDiligence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
	 */
	public int countAll();

}