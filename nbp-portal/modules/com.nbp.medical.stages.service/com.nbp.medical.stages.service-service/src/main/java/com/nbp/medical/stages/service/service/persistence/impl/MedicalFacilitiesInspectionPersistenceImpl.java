/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.medical.stages.service.exception.NoSuchMedicalFacilitiesInspectionException;
import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;
import com.nbp.medical.stages.service.model.MedicalFacilitiesInspectionTable;
import com.nbp.medical.stages.service.model.impl.MedicalFacilitiesInspectionImpl;
import com.nbp.medical.stages.service.model.impl.MedicalFacilitiesInspectionModelImpl;
import com.nbp.medical.stages.service.service.persistence.MedicalFacilitiesInspectionPersistence;
import com.nbp.medical.stages.service.service.persistence.MedicalFacilitiesInspectionUtil;
import com.nbp.medical.stages.service.service.persistence.impl.constants.MEDICAL_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the medical facilities inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesInspectionPersistence.class)
public class MedicalFacilitiesInspectionPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesInspection>
	implements MedicalFacilitiesInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesInspectionUtil</code> to access the medical facilities inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMedicalInspectionBy_CI;
	private FinderPath _finderPathCountBygetMedicalInspectionBy_CI;

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMedicalInspectionBy_CI(
			String caseId)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMedicalInspectionBy_CI(caseId);

		if (medicalFacilitiesInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
		}

		return medicalFacilitiesInspection;
	}

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId) {

		return fetchBygetMedicalInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesInspection) {
			MedicalFacilitiesInspection medicalFacilitiesInspection =
				(MedicalFacilitiesInspection)result;

			if (!Objects.equals(
					caseId, medicalFacilitiesInspection.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<MedicalFacilitiesInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalInspectionBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"MedicalFacilitiesInspectionPersistenceImpl.fetchBygetMedicalInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesInspection medicalFacilitiesInspection =
						list.get(0);

					result = medicalFacilitiesInspection;

					cacheResult(medicalFacilitiesInspection);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesInspection)result;
		}
	}

	/**
	 * Removes the medical facilities inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities inspection that was removed
	 */
	@Override
	public MedicalFacilitiesInspection removeBygetMedicalInspectionBy_CI(
			String caseId)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findBygetMedicalInspectionBy_CI(caseId);

		return remove(medicalFacilitiesInspection);
	}

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMedicalInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMedicalInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_2 =
			"medicalFacilitiesInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMEDICALINSPECTIONBY_CI_CASEID_3 =
			"(medicalFacilitiesInspection.caseId IS NULL OR medicalFacilitiesInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMed_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMed_FBAI;
	private FinderPath _finderPathCountBygetMed_FBAI;

	/**
	 * Returns all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId) {

		return findBygetMed_FBAI(
			medicalApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end) {

		return findBygetMed_FBAI(medicalApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findBygetMed_FBAI(
			medicalApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMed_FBAI;
				finderArgs = new Object[] {medicalApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMed_FBAI;
			finderArgs = new Object[] {
				medicalApplicationId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesInspection medicalFacilitiesInspection :
						list) {

					if (medicalApplicationId !=
							medicalFacilitiesInspection.
								getMedicalApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETMED_FBAI_MEDICALAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalApplicationId);

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_FBAI_First(
			long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_FBAI_First(medicalApplicationId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalApplicationId=");
		sb.append(medicalApplicationId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_FBAI_First(
		long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		List<MedicalFacilitiesInspection> list = findBygetMed_FBAI(
			medicalApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_FBAI_Last(
			long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_FBAI_Last(medicalApplicationId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalApplicationId=");
		sb.append(medicalApplicationId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_FBAI_Last(
		long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		int count = countBygetMed_FBAI(medicalApplicationId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesInspection> list = findBygetMed_FBAI(
			medicalApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection[] findBygetMed_FBAI_PrevAndNext(
			long medicalInspectionId, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findByPrimaryKey(medicalInspectionId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection[] array =
				new MedicalFacilitiesInspectionImpl[3];

			array[0] = getBygetMed_FBAI_PrevAndNext(
				session, medicalFacilitiesInspection, medicalApplicationId,
				orderByComparator, true);

			array[1] = medicalFacilitiesInspection;

			array[2] = getBygetMed_FBAI_PrevAndNext(
				session, medicalFacilitiesInspection, medicalApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesInspection getBygetMed_FBAI_PrevAndNext(
		Session session,
		MedicalFacilitiesInspection medicalFacilitiesInspection,
		long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETMED_FBAI_MEDICALAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(medicalApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities inspections where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 */
	@Override
	public void removeBygetMed_FBAI(long medicalApplicationId) {
		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findBygetMed_FBAI(
					medicalApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMed_FBAI(long medicalApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMed_FBAI;

		Object[] finderArgs = new Object[] {medicalApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETMED_FBAI_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMED_FBAI_MEDICALAPPLICATIONID_2 =
			"medicalFacilitiesInspection.medicalApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMed_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMed_CaseId;
	private FinderPath _finderPathCountBygetMed_CaseId;

	/**
	 * Returns all the medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId) {

		return findBygetMed_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end) {

		return findBygetMed_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findBygetMed_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMed_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMed_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesInspection medicalFacilitiesInspection :
						list) {

					if (!caseId.equals(
							medicalFacilitiesInspection.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseId_First(
			String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseId_First(caseId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseId_First(
		String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		List<MedicalFacilitiesInspection> list = findBygetMed_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseId_Last(
			String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseId_Last(caseId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseId_Last(
		String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		int count = countBygetMed_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesInspection> list = findBygetMed_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection[] findBygetMed_CaseId_PrevAndNext(
			long medicalInspectionId, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		caseId = Objects.toString(caseId, "");

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findByPrimaryKey(medicalInspectionId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection[] array =
				new MedicalFacilitiesInspectionImpl[3];

			array[0] = getBygetMed_CaseId_PrevAndNext(
				session, medicalFacilitiesInspection, caseId, orderByComparator,
				true);

			array[1] = medicalFacilitiesInspection;

			array[2] = getBygetMed_CaseId_PrevAndNext(
				session, medicalFacilitiesInspection, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesInspection getBygetMed_CaseId_PrevAndNext(
		Session session,
		MedicalFacilitiesInspection medicalFacilitiesInspection, String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMed_CaseId(String caseId) {
		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findBygetMed_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMed_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMed_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETMED_CASEID_CASEID_2 =
		"medicalFacilitiesInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMED_CASEID_CASEID_3 =
		"(medicalFacilitiesInspection.caseId IS NULL OR medicalFacilitiesInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMed_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetMed_Status;
	private FinderPath _finderPathCountBygetMed_Status;

	/**
	 * Returns all the medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status) {

		return findBygetMed_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end) {

		return findBygetMed_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findBygetMed_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMed_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMed_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesInspection medicalFacilitiesInspection :
						list) {

					if (!status.equals(
							medicalFacilitiesInspection.getStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_Status_First(
			String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_Status_First(status, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_Status_First(
		String status,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		List<MedicalFacilitiesInspection> list = findBygetMed_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_Status_Last(
			String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_Status_Last(status, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_Status_Last(
		String status,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		int count = countBygetMed_Status(status);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesInspection> list = findBygetMed_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection[] findBygetMed_Status_PrevAndNext(
			long medicalInspectionId, String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		status = Objects.toString(status, "");

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findByPrimaryKey(medicalInspectionId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection[] array =
				new MedicalFacilitiesInspectionImpl[3];

			array[0] = getBygetMed_Status_PrevAndNext(
				session, medicalFacilitiesInspection, status, orderByComparator,
				true);

			array[1] = medicalFacilitiesInspection;

			array[2] = getBygetMed_Status_PrevAndNext(
				session, medicalFacilitiesInspection, status, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesInspection getBygetMed_Status_PrevAndNext(
		Session session,
		MedicalFacilitiesInspection medicalFacilitiesInspection, String status,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMed_Status(String status) {
		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findBygetMed_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMed_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMed_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETMED_STATUS_STATUS_2 =
		"medicalFacilitiesInspection.status = ?";

	private static final String _FINDER_COLUMN_GETMED_STATUS_STATUS_3 =
		"(medicalFacilitiesInspection.status IS NULL OR medicalFacilitiesInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetMed_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetMed_CaseIdStatus;
	private FinderPath _finderPathCountBygetMed_CaseIdStatus;

	/**
	 * Returns all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId) {

		return findBygetMed_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetMed_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findBygetMed_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMed_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMed_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesInspection medicalFacilitiesInspection :
						list) {

					if (!status.equals(
							medicalFacilitiesInspection.getStatus()) ||
						!caseId.equals(
							medicalFacilitiesInspection.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseIdStatus_First(status, caseId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		List<MedicalFacilitiesInspection> list = findBygetMed_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseIdStatus_Last(status, caseId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		int count = countBygetMed_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesInspection> list = findBygetMed_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection[] findBygetMed_CaseIdStatus_PrevAndNext(
			long medicalInspectionId, String status, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findByPrimaryKey(medicalInspectionId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection[] array =
				new MedicalFacilitiesInspectionImpl[3];

			array[0] = getBygetMed_CaseIdStatus_PrevAndNext(
				session, medicalFacilitiesInspection, status, caseId,
				orderByComparator, true);

			array[1] = medicalFacilitiesInspection;

			array[2] = getBygetMed_CaseIdStatus_PrevAndNext(
				session, medicalFacilitiesInspection, status, caseId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesInspection getBygetMed_CaseIdStatus_PrevAndNext(
		Session session,
		MedicalFacilitiesInspection medicalFacilitiesInspection, String status,
		String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMed_CaseIdStatus(String status, String caseId) {
		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findBygetMed_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMed_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMed_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_2 =
		"medicalFacilitiesInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETMED_CASEIDSTATUS_STATUS_3 =
		"(medicalFacilitiesInspection.status IS NULL OR medicalFacilitiesInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_2 =
		"medicalFacilitiesInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMED_CASEIDSTATUS_CASEID_3 =
		"(medicalFacilitiesInspection.caseId IS NULL OR medicalFacilitiesInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetMed_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMed_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetMed_CaseIdApplicationId;

	/**
	 * Returns all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId) {

		return findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId, int start, int end) {

		return findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMed_CaseIdApplicationId;
				finderArgs = new Object[] {status, medicalApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMed_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, medicalApplicationId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesInspection medicalFacilitiesInspection :
						list) {

					if (!status.equals(
							medicalFacilitiesInspection.getStatus()) ||
						(medicalApplicationId !=
							medicalFacilitiesInspection.
								getMedicalApplicationId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_MEDICALAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(medicalApplicationId);

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseIdApplicationId_First(
			String status, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseIdApplicationId_First(
				status, medicalApplicationId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", medicalApplicationId=");
		sb.append(medicalApplicationId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdApplicationId_First(
		String status, long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		List<MedicalFacilitiesInspection> list =
			findBygetMed_CaseIdApplicationId(
				status, medicalApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findBygetMed_CaseIdApplicationId_Last(
			String status, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetMed_CaseIdApplicationId_Last(
				status, medicalApplicationId, orderByComparator);

		if (medicalFacilitiesInspection != null) {
			return medicalFacilitiesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", medicalApplicationId=");
		sb.append(medicalApplicationId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdApplicationId_Last(
		String status, long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		int count = countBygetMed_CaseIdApplicationId(
			status, medicalApplicationId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesInspection> list =
			findBygetMed_CaseIdApplicationId(
				status, medicalApplicationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection[]
			findBygetMed_CaseIdApplicationId_PrevAndNext(
				long medicalInspectionId, String status,
				long medicalApplicationId,
				OrderByComparator<MedicalFacilitiesInspection>
					orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException {

		status = Objects.toString(status, "");

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findByPrimaryKey(medicalInspectionId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection[] array =
				new MedicalFacilitiesInspectionImpl[3];

			array[0] = getBygetMed_CaseIdApplicationId_PrevAndNext(
				session, medicalFacilitiesInspection, status,
				medicalApplicationId, orderByComparator, true);

			array[1] = medicalFacilitiesInspection;

			array[2] = getBygetMed_CaseIdApplicationId_PrevAndNext(
				session, medicalFacilitiesInspection, status,
				medicalApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesInspection
		getBygetMed_CaseIdApplicationId_PrevAndNext(
			Session session,
			MedicalFacilitiesInspection medicalFacilitiesInspection,
			String status, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_MEDICALAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(medicalApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 */
	@Override
	public void removeBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId) {

		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findBygetMed_CaseIdApplicationId(
					status, medicalApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMed_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, medicalApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(medicalApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_2 =
			"medicalFacilitiesInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_STATUS_3 =
			"(medicalFacilitiesInspection.status IS NULL OR medicalFacilitiesInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMED_CASEIDAPPLICATIONID_MEDICALAPPLICATIONID_2 =
			"medicalFacilitiesInspection.medicalApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);

		if (medicalFacilitiesInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", medicalApplicationId=");
			sb.append(medicalApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesInspectionException(sb.toString());
		}

		return medicalFacilitiesInspection;
	}

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, medicalApplicationId, true);
	}

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	@Override
	public MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, medicalApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesInspection) {
			MedicalFacilitiesInspection medicalFacilitiesInspection =
				(MedicalFacilitiesInspection)result;

			if (!Objects.equals(
					status, medicalFacilitiesInspection.getStatus()) ||
				(slotBookedByUser !=
					medicalFacilitiesInspection.getSlotBookedByUser()) ||
				(medicalApplicationId !=
					medicalFacilitiesInspection.getMedicalApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(medicalApplicationId);

				List<MedicalFacilitiesInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser,
									medicalApplicationId
								};
							}

							_log.warn(
								"MedicalFacilitiesInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesInspection medicalFacilitiesInspection =
						list.get(0);

					result = medicalFacilitiesInspection;

					cacheResult(medicalFacilitiesInspection);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesInspection)result;
		}
	}

	/**
	 * Removes the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the medical facilities inspection that was removed
	 */
	@Override
	public MedicalFacilitiesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);

		return remove(medicalFacilitiesInspection);
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long medicalApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, medicalApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MEDICALAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(medicalApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"medicalFacilitiesInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(medicalFacilitiesInspection.status IS NULL OR medicalFacilitiesInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"medicalFacilitiesInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_MEDICALAPPLICATIONID_2 =
			"medicalFacilitiesInspection.medicalApplicationId = ?";

	public MedicalFacilitiesInspectionPersistenceImpl() {
		setModelClass(MedicalFacilitiesInspection.class);

		setModelImplClass(MedicalFacilitiesInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesInspectionTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities inspection in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		entityCache.putResult(
			MedicalFacilitiesInspectionImpl.class,
			medicalFacilitiesInspection.getPrimaryKey(),
			medicalFacilitiesInspection);

		finderCache.putResult(
			_finderPathFetchBygetMedicalInspectionBy_CI,
			new Object[] {medicalFacilitiesInspection.getCaseId()},
			medicalFacilitiesInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				medicalFacilitiesInspection.getStatus(),
				medicalFacilitiesInspection.getSlotBookedByUser(),
				medicalFacilitiesInspection.getMedicalApplicationId()
			},
			medicalFacilitiesInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities inspections in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspections the medical facilities inspections
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesInspection> medicalFacilitiesInspections) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				medicalFacilitiesInspections) {

			if (entityCache.getResult(
					MedicalFacilitiesInspectionImpl.class,
					medicalFacilitiesInspection.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesInspection);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesInspectionImpl.class);

		finderCache.clearCache(MedicalFacilitiesInspectionImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		entityCache.removeResult(
			MedicalFacilitiesInspectionImpl.class, medicalFacilitiesInspection);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesInspection> medicalFacilitiesInspections) {

		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				medicalFacilitiesInspections) {

			entityCache.removeResult(
				MedicalFacilitiesInspectionImpl.class,
				medicalFacilitiesInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesInspectionModelImpl
			medicalFacilitiesInspectionModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesInspectionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalInspectionBy_CI, args,
			medicalFacilitiesInspectionModelImpl);

		args = new Object[] {
			medicalFacilitiesInspectionModelImpl.getStatus(),
			medicalFacilitiesInspectionModelImpl.getSlotBookedByUser(),
			medicalFacilitiesInspectionModelImpl.getMedicalApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, medicalFacilitiesInspectionModelImpl);
	}

	/**
	 * Creates a new medical facilities inspection with the primary key. Does not add the medical facilities inspection to the database.
	 *
	 * @param medicalInspectionId the primary key for the new medical facilities inspection
	 * @return the new medical facilities inspection
	 */
	@Override
	public MedicalFacilitiesInspection create(long medicalInspectionId) {
		MedicalFacilitiesInspection medicalFacilitiesInspection =
			new MedicalFacilitiesInspectionImpl();

		medicalFacilitiesInspection.setNew(true);
		medicalFacilitiesInspection.setPrimaryKey(medicalInspectionId);

		medicalFacilitiesInspection.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesInspection;
	}

	/**
	 * Removes the medical facilities inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection remove(long medicalInspectionId)
		throws NoSuchMedicalFacilitiesInspectionException {

		return remove((Serializable)medicalInspectionId);
	}

	/**
	 * Removes the medical facilities inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesInspectionException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesInspection medicalFacilitiesInspection =
				(MedicalFacilitiesInspection)session.get(
					MedicalFacilitiesInspectionImpl.class, primaryKey);

			if (medicalFacilitiesInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesInspection);
		}
		catch (NoSuchMedicalFacilitiesInspectionException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MedicalFacilitiesInspection removeImpl(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesInspection)) {
				medicalFacilitiesInspection =
					(MedicalFacilitiesInspection)session.get(
						MedicalFacilitiesInspectionImpl.class,
						medicalFacilitiesInspection.getPrimaryKeyObj());
			}

			if (medicalFacilitiesInspection != null) {
				session.delete(medicalFacilitiesInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesInspection != null) {
			clearCache(medicalFacilitiesInspection);
		}

		return medicalFacilitiesInspection;
	}

	@Override
	public MedicalFacilitiesInspection updateImpl(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		boolean isNew = medicalFacilitiesInspection.isNew();

		if (!(medicalFacilitiesInspection instanceof
				MedicalFacilitiesInspectionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					medicalFacilitiesInspection.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesInspection implementation " +
					medicalFacilitiesInspection.getClass());
		}

		MedicalFacilitiesInspectionModelImpl
			medicalFacilitiesInspectionModelImpl =
				(MedicalFacilitiesInspectionModelImpl)
					medicalFacilitiesInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesInspection.setCreateDate(date);
			}
			else {
				medicalFacilitiesInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesInspection.setModifiedDate(date);
			}
			else {
				medicalFacilitiesInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesInspection);
			}
			else {
				medicalFacilitiesInspection =
					(MedicalFacilitiesInspection)session.merge(
						medicalFacilitiesInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesInspectionImpl.class,
			medicalFacilitiesInspectionModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesInspectionModelImpl);

		if (isNew) {
			medicalFacilitiesInspection.setNew(false);
		}

		medicalFacilitiesInspection.resetOriginalValues();

		return medicalFacilitiesInspection;
	}

	/**
	 * Returns the medical facilities inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities inspection
	 * @return the medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesInspectionException {

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			fetchByPrimaryKey(primaryKey);

		if (medicalFacilitiesInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesInspection;
	}

	/**
	 * Returns the medical facilities inspection with the primary key or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection findByPrimaryKey(
			long medicalInspectionId)
		throws NoSuchMedicalFacilitiesInspectionException {

		return findByPrimaryKey((Serializable)medicalInspectionId);
	}

	/**
	 * Returns the medical facilities inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection, or <code>null</code> if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesInspection fetchByPrimaryKey(
		long medicalInspectionId) {

		return fetchByPrimaryKey((Serializable)medicalInspectionId);
	}

	/**
	 * Returns all the medical facilities inspections.
	 *
	 * @return the medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities inspections
	 */
	@Override
	public List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<MedicalFacilitiesInspection> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESINSPECTION;

				sql = sql.concat(
					MedicalFacilitiesInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesInspection>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the medical facilities inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesInspection medicalFacilitiesInspection :
				findAll()) {

			remove(medicalFacilitiesInspection);
		}
	}

	/**
	 * Returns the number of medical facilities inspections.
	 *
	 * @return the number of medical facilities inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MEDICALFACILITIESINSPECTION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "medicalInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities inspection persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetMedicalInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMedicalInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMed_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMed_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"medicalApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMed_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMed_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"medicalApplicationId"}, true);

		_finderPathCountBygetMed_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMed_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"medicalApplicationId"}, false);

		_finderPathWithPaginationFindBygetMed_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMed_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMed_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMed_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMed_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMed_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMed_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMed_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMed_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMed_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetMed_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMed_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetMed_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMed_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetMed_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMed_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetMed_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMed_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetMed_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMed_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "medicalApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMed_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMed_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "medicalApplicationId"}, true);

		_finderPathCountBygetMed_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMed_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "medicalApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "medicalApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "medicalApplicationId"
				},
				false);

		MedicalFacilitiesInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesInspectionUtil.setPersistence(null);

		entityCache.removeCache(
			MedicalFacilitiesInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALFACILITIESINSPECTION =
		"SELECT medicalFacilitiesInspection FROM MedicalFacilitiesInspection medicalFacilitiesInspection";

	private static final String _SQL_SELECT_MEDICALFACILITIESINSPECTION_WHERE =
		"SELECT medicalFacilitiesInspection FROM MedicalFacilitiesInspection medicalFacilitiesInspection WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESINSPECTION =
		"SELECT COUNT(medicalFacilitiesInspection) FROM MedicalFacilitiesInspection medicalFacilitiesInspection";

	private static final String _SQL_COUNT_MEDICALFACILITIESINSPECTION_WHERE =
		"SELECT COUNT(medicalFacilitiesInspection) FROM MedicalFacilitiesInspection medicalFacilitiesInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}