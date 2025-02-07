/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence.impl;

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

import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureInspectionException;
import com.nbp.agriculture.stages.services.model.AgricultureInspection;
import com.nbp.agriculture.stages.services.model.AgricultureInspectionTable;
import com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionImpl;
import com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl;
import com.nbp.agriculture.stages.services.service.persistence.AgricultureInspectionPersistence;
import com.nbp.agriculture.stages.services.service.persistence.AgricultureInspectionUtil;
import com.nbp.agriculture.stages.services.service.persistence.impl.constants.NBP_AGRIPersistenceConstants;

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
 * The persistence implementation for the agriculture inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureInspectionPersistence.class)
public class AgricultureInspectionPersistenceImpl
	extends BasePersistenceImpl<AgricultureInspection>
	implements AgricultureInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureInspectionUtil</code> to access the agriculture inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgricultureInspectionBy_CI;
	private FinderPath _finderPathCountBygetAgricultureInspectionBy_CI;

	/**
	 * Returns the agriculture inspection where caseId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAgricultureInspectionBy_CI(
			String caseId)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetAgricultureInspectionBy_CI(caseId);

		if (agricultureInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureInspectionException(sb.toString());
		}

		return agricultureInspection;
	}

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId) {

		return fetchBygetAgricultureInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureInspectionBy_CI, finderArgs,
				this);
		}

		if (result instanceof AgricultureInspection) {
			AgricultureInspection agricultureInspection =
				(AgricultureInspection)result;

			if (!Objects.equals(caseId, agricultureInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_2);
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

				List<AgricultureInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureInspectionBy_CI,
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
								"AgricultureInspectionPersistenceImpl.fetchBygetAgricultureInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureInspection agricultureInspection = list.get(0);

					result = agricultureInspection;

					cacheResult(agricultureInspection);
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
			return (AgricultureInspection)result;
		}
	}

	/**
	 * Removes the agriculture inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture inspection that was removed
	 */
	@Override
	public AgricultureInspection removeBygetAgricultureInspectionBy_CI(
			String caseId)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			findBygetAgricultureInspectionBy_CI(caseId);

		return remove(agricultureInspection);
	}

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetAgricultureInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAgricultureInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_2 =
			"agricultureInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREINSPECTIONBY_CI_CASEID_3 =
			"(agricultureInspection.caseId IS NULL OR agricultureInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetAI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetAI_CaseId;
	private FinderPath _finderPathCountBygetAI_CaseId;

	/**
	 * Returns all the agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseId(String caseId) {
		return findBygetAI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end) {

		return findBygetAI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findBygetAI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureInspection agricultureInspection : list) {
					if (!caseId.equals(agricultureInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseId_First(
			String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetAI_CaseId_First(
			caseId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseId_First(
		String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		List<AgricultureInspection> list = findBygetAI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseId_Last(
			String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetAI_CaseId_Last(
			caseId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseId_Last(
		String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		int count = countBygetAI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<AgricultureInspection> list = findBygetAI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection[] findBygetAI_CaseId_PrevAndNext(
			long agricultureInspectionId, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		caseId = Objects.toString(caseId, "");

		AgricultureInspection agricultureInspection = findByPrimaryKey(
			agricultureInspectionId);

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection[] array = new AgricultureInspectionImpl[3];

			array[0] = getBygetAI_CaseId_PrevAndNext(
				session, agricultureInspection, caseId, orderByComparator,
				true);

			array[1] = agricultureInspection;

			array[2] = getBygetAI_CaseId_PrevAndNext(
				session, agricultureInspection, caseId, orderByComparator,
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

	protected AgricultureInspection getBygetAI_CaseId_PrevAndNext(
		Session session, AgricultureInspection agricultureInspection,
		String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_2);
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
			sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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
						agricultureInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetAI_CaseId(String caseId) {
		for (AgricultureInspection agricultureInspection :
				findBygetAI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetAI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETAI_CASEID_CASEID_2 =
		"agricultureInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETAI_CASEID_CASEID_3 =
		"(agricultureInspection.caseId IS NULL OR agricultureInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CAI;
	private FinderPath _finderPathCountBygetCI_CAI;

	/**
	 * Returns all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetCI_CAI(long agriApplicationId) {
		return findBygetCI_CAI(
			agriApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end) {

		return findBygetCI_CAI(agriApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findBygetCI_CAI(
			agriApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CAI;
				finderArgs = new Object[] {agriApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CAI;
			finderArgs = new Object[] {
				agriApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureInspection agricultureInspection : list) {
					if (agriApplicationId !=
							agricultureInspection.getAgriApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_AGRIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agriApplicationId);

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetCI_CAI_First(
			long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetCI_CAI_First(
			agriApplicationId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agriApplicationId=");
		sb.append(agriApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetCI_CAI_First(
		long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		List<AgricultureInspection> list = findBygetCI_CAI(
			agriApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetCI_CAI_Last(
			long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetCI_CAI_Last(
			agriApplicationId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agriApplicationId=");
		sb.append(agriApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetCI_CAI_Last(
		long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		int count = countBygetCI_CAI(agriApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureInspection> list = findBygetCI_CAI(
			agriApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection[] findBygetCI_CAI_PrevAndNext(
			long agricultureInspectionId, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = findByPrimaryKey(
			agricultureInspectionId);

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection[] array = new AgricultureInspectionImpl[3];

			array[0] = getBygetCI_CAI_PrevAndNext(
				session, agricultureInspection, agriApplicationId,
				orderByComparator, true);

			array[1] = agricultureInspection;

			array[2] = getBygetCI_CAI_PrevAndNext(
				session, agricultureInspection, agriApplicationId,
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

	protected AgricultureInspection getBygetCI_CAI_PrevAndNext(
		Session session, AgricultureInspection agricultureInspection,
		long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETCI_CAI_AGRIAPPLICATIONID_2);

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
			sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(agriApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agricultureInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture inspections where agriApplicationId = &#63; from the database.
	 *
	 * @param agriApplicationId the agri application ID
	 */
	@Override
	public void removeBygetCI_CAI(long agriApplicationId) {
		for (AgricultureInspection agricultureInspection :
				findBygetCI_CAI(
					agriApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetCI_CAI(long agriApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCI_CAI;

		Object[] finderArgs = new Object[] {agriApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_AGRIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agriApplicationId);

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

	private static final String _FINDER_COLUMN_GETCI_CAI_AGRIAPPLICATIONID_2 =
		"agricultureInspection.agriApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetAI_Status;
	private FinderPath _finderPathCountBygetAI_Status;

	/**
	 * Returns all the agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_Status(String status) {
		return findBygetAI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end) {

		return findBygetAI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findBygetAI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureInspection agricultureInspection : list) {
					if (!status.equals(agricultureInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_Status_First(
			String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetAI_Status_First(
			status, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_Status_First(
		String status,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		List<AgricultureInspection> list = findBygetAI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_Status_Last(
			String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchBygetAI_Status_Last(
			status, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_Status_Last(
		String status,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		int count = countBygetAI_Status(status);

		if (count == 0) {
			return null;
		}

		List<AgricultureInspection> list = findBygetAI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection[] findBygetAI_Status_PrevAndNext(
			long agricultureInspectionId, String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		status = Objects.toString(status, "");

		AgricultureInspection agricultureInspection = findByPrimaryKey(
			agricultureInspectionId);

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection[] array = new AgricultureInspectionImpl[3];

			array[0] = getBygetAI_Status_PrevAndNext(
				session, agricultureInspection, status, orderByComparator,
				true);

			array[1] = agricultureInspection;

			array[2] = getBygetAI_Status_PrevAndNext(
				session, agricultureInspection, status, orderByComparator,
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

	protected AgricultureInspection getBygetAI_Status_PrevAndNext(
		Session session, AgricultureInspection agricultureInspection,
		String status,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_2);
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
			sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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
						agricultureInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetAI_Status(String status) {
		for (AgricultureInspection agricultureInspection :
				findBygetAI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetAI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetAI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETAI_STATUS_STATUS_2 =
		"agricultureInspection.status = ?";

	private static final String _FINDER_COLUMN_GETAI_STATUS_STATUS_3 =
		"(agricultureInspection.status IS NULL OR agricultureInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetAI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetAI_CaseIdStatus;
	private FinderPath _finderPathCountBygetAI_CaseIdStatus;

	/**
	 * Returns all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId) {

		return findBygetAI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetAI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findBygetAI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureInspection agricultureInspection : list) {
					if (!status.equals(agricultureInspection.getStatus()) ||
						!caseId.equals(agricultureInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetAI_CaseIdStatus_First(status, caseId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		List<AgricultureInspection> list = findBygetAI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetAI_CaseIdStatus_Last(status, caseId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		int count = countBygetAI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<AgricultureInspection> list = findBygetAI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection[] findBygetAI_CaseIdStatus_PrevAndNext(
			long agricultureInspectionId, String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		AgricultureInspection agricultureInspection = findByPrimaryKey(
			agricultureInspectionId);

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection[] array = new AgricultureInspectionImpl[3];

			array[0] = getBygetAI_CaseIdStatus_PrevAndNext(
				session, agricultureInspection, status, caseId,
				orderByComparator, true);

			array[1] = agricultureInspection;

			array[2] = getBygetAI_CaseIdStatus_PrevAndNext(
				session, agricultureInspection, status, caseId,
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

	protected AgricultureInspection getBygetAI_CaseIdStatus_PrevAndNext(
		Session session, AgricultureInspection agricultureInspection,
		String status, String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_2);
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
			sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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
						agricultureInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetAI_CaseIdStatus(String status, String caseId) {
		for (AgricultureInspection agricultureInspection :
				findBygetAI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetAI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_2 =
		"agricultureInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETAI_CASEIDSTATUS_STATUS_3 =
		"(agricultureInspection.status IS NULL OR agricultureInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_2 =
		"agricultureInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETAI_CASEIDSTATUS_CASEID_3 =
		"(agricultureInspection.caseId IS NULL OR agricultureInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetAI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetAI_CaseIdApplicationId;

	/**
	 * Returns all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		return findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end) {

		return findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAI_CaseIdApplicationId;
				finderArgs = new Object[] {status, agriApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, agriApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureInspection agricultureInspection : list) {
					if (!status.equals(agricultureInspection.getStatus()) ||
						(agriApplicationId !=
							agricultureInspection.getAgriApplicationId())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_AGRIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(agriApplicationId);

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseIdApplicationId_First(
			String status, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetAI_CaseIdApplicationId_First(
				status, agriApplicationId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", agriApplicationId=");
		sb.append(agriApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseIdApplicationId_First(
		String status, long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		List<AgricultureInspection> list = findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection findBygetAI_CaseIdApplicationId_Last(
			String status, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetAI_CaseIdApplicationId_Last(
				status, agriApplicationId, orderByComparator);

		if (agricultureInspection != null) {
			return agricultureInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", agriApplicationId=");
		sb.append(agriApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureInspectionException(sb.toString());
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection fetchBygetAI_CaseIdApplicationId_Last(
		String status, long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		int count = countBygetAI_CaseIdApplicationId(status, agriApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureInspection> list = findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection[] findBygetAI_CaseIdApplicationId_PrevAndNext(
			long agricultureInspectionId, String status, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException {

		status = Objects.toString(status, "");

		AgricultureInspection agricultureInspection = findByPrimaryKey(
			agricultureInspectionId);

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection[] array = new AgricultureInspectionImpl[3];

			array[0] = getBygetAI_CaseIdApplicationId_PrevAndNext(
				session, agricultureInspection, status, agriApplicationId,
				orderByComparator, true);

			array[1] = agricultureInspection;

			array[2] = getBygetAI_CaseIdApplicationId_PrevAndNext(
				session, agricultureInspection, status, agriApplicationId,
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

	protected AgricultureInspection getBygetAI_CaseIdApplicationId_PrevAndNext(
		Session session, AgricultureInspection agricultureInspection,
		String status, long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_AGRIAPPLICATIONID_2);

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
			sb.append(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(agriApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agricultureInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 */
	@Override
	public void removeBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		for (AgricultureInspection agricultureInspection :
				findBygetAI_CaseIdApplicationId(
					status, agriApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetAI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, agriApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_AGRIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(agriApplicationId);

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
		_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_2 =
			"agricultureInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_STATUS_3 =
			"(agricultureInspection.status IS NULL OR agricultureInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETAI_CASEIDAPPLICATIONID_AGRIAPPLICATIONID_2 =
			"agricultureInspection.agriApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);

		if (agricultureInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", agriApplicationId=");
			sb.append(agriApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureInspectionException(sb.toString());
		}

		return agricultureInspection;
	}

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, agriApplicationId, true);
	}

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	@Override
	public AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, agriApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof AgricultureInspection) {
			AgricultureInspection agricultureInspection =
				(AgricultureInspection)result;

			if (!Objects.equals(status, agricultureInspection.getStatus()) ||
				(slotBookedByUser !=
					agricultureInspection.getSlotBookedByUser()) ||
				(agriApplicationId !=
					agricultureInspection.getAgriApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_AGRICULTUREINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_AGRIAPPLICATIONID_2);

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

				queryPos.add(agriApplicationId);

				List<AgricultureInspection> list = query.list();

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
									status, slotBookedByUser, agriApplicationId
								};
							}

							_log.warn(
								"AgricultureInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureInspection agricultureInspection = list.get(0);

					result = agricultureInspection;

					cacheResult(agricultureInspection);
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
			return (AgricultureInspection)result;
		}
	}

	/**
	 * Removes the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the agriculture inspection that was removed
	 */
	@Override
	public AgricultureInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);

		return remove(agricultureInspection);
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long agriApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, agriApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_AGRICULTUREINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_AGRIAPPLICATIONID_2);

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

				queryPos.add(agriApplicationId);

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
			"agricultureInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(agricultureInspection.status IS NULL OR agricultureInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"agricultureInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_AGRIAPPLICATIONID_2 =
			"agricultureInspection.agriApplicationId = ?";

	public AgricultureInspectionPersistenceImpl() {
		setModelClass(AgricultureInspection.class);

		setModelImplClass(AgricultureInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureInspectionTable.INSTANCE);
	}

	/**
	 * Caches the agriculture inspection in the entity cache if it is enabled.
	 *
	 * @param agricultureInspection the agriculture inspection
	 */
	@Override
	public void cacheResult(AgricultureInspection agricultureInspection) {
		entityCache.putResult(
			AgricultureInspectionImpl.class,
			agricultureInspection.getPrimaryKey(), agricultureInspection);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureInspectionBy_CI,
			new Object[] {agricultureInspection.getCaseId()},
			agricultureInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				agricultureInspection.getStatus(),
				agricultureInspection.getSlotBookedByUser(),
				agricultureInspection.getAgriApplicationId()
			},
			agricultureInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture inspections in the entity cache if it is enabled.
	 *
	 * @param agricultureInspections the agriculture inspections
	 */
	@Override
	public void cacheResult(
		List<AgricultureInspection> agricultureInspections) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureInspection agricultureInspection :
				agricultureInspections) {

			if (entityCache.getResult(
					AgricultureInspectionImpl.class,
					agricultureInspection.getPrimaryKey()) == null) {

				cacheResult(agricultureInspection);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureInspectionImpl.class);

		finderCache.clearCache(AgricultureInspectionImpl.class);
	}

	/**
	 * Clears the cache for the agriculture inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureInspection agricultureInspection) {
		entityCache.removeResult(
			AgricultureInspectionImpl.class, agricultureInspection);
	}

	@Override
	public void clearCache(List<AgricultureInspection> agricultureInspections) {
		for (AgricultureInspection agricultureInspection :
				agricultureInspections) {

			entityCache.removeResult(
				AgricultureInspectionImpl.class, agricultureInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureInspectionModelImpl agricultureInspectionModelImpl) {

		Object[] args = new Object[] {
			agricultureInspectionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureInspectionBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureInspectionBy_CI, args,
			agricultureInspectionModelImpl);

		args = new Object[] {
			agricultureInspectionModelImpl.getStatus(),
			agricultureInspectionModelImpl.getSlotBookedByUser(),
			agricultureInspectionModelImpl.getAgriApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, agricultureInspectionModelImpl);
	}

	/**
	 * Creates a new agriculture inspection with the primary key. Does not add the agriculture inspection to the database.
	 *
	 * @param agricultureInspectionId the primary key for the new agriculture inspection
	 * @return the new agriculture inspection
	 */
	@Override
	public AgricultureInspection create(long agricultureInspectionId) {
		AgricultureInspection agricultureInspection =
			new AgricultureInspectionImpl();

		agricultureInspection.setNew(true);
		agricultureInspection.setPrimaryKey(agricultureInspectionId);

		agricultureInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureInspection;
	}

	/**
	 * Removes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection remove(long agricultureInspectionId)
		throws NoSuchAgricultureInspectionException {

		return remove((Serializable)agricultureInspectionId);
	}

	/**
	 * Removes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection remove(Serializable primaryKey)
		throws NoSuchAgricultureInspectionException {

		Session session = null;

		try {
			session = openSession();

			AgricultureInspection agricultureInspection =
				(AgricultureInspection)session.get(
					AgricultureInspectionImpl.class, primaryKey);

			if (agricultureInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureInspection);
		}
		catch (NoSuchAgricultureInspectionException noSuchEntityException) {
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
	protected AgricultureInspection removeImpl(
		AgricultureInspection agricultureInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureInspection)) {
				agricultureInspection = (AgricultureInspection)session.get(
					AgricultureInspectionImpl.class,
					agricultureInspection.getPrimaryKeyObj());
			}

			if (agricultureInspection != null) {
				session.delete(agricultureInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureInspection != null) {
			clearCache(agricultureInspection);
		}

		return agricultureInspection;
	}

	@Override
	public AgricultureInspection updateImpl(
		AgricultureInspection agricultureInspection) {

		boolean isNew = agricultureInspection.isNew();

		if (!(agricultureInspection instanceof
				AgricultureInspectionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureInspection implementation " +
					agricultureInspection.getClass());
		}

		AgricultureInspectionModelImpl agricultureInspectionModelImpl =
			(AgricultureInspectionModelImpl)agricultureInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureInspection.setCreateDate(date);
			}
			else {
				agricultureInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureInspection.setModifiedDate(date);
			}
			else {
				agricultureInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureInspection);
			}
			else {
				agricultureInspection = (AgricultureInspection)session.merge(
					agricultureInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureInspectionImpl.class, agricultureInspectionModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureInspectionModelImpl);

		if (isNew) {
			agricultureInspection.setNew(false);
		}

		agricultureInspection.resetOriginalValues();

		return agricultureInspection;
	}

	/**
	 * Returns the agriculture inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureInspectionException {

		AgricultureInspection agricultureInspection = fetchByPrimaryKey(
			primaryKey);

		if (agricultureInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureInspection;
	}

	/**
	 * Returns the agriculture inspection with the primary key or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection findByPrimaryKey(long agricultureInspectionId)
		throws NoSuchAgricultureInspectionException {

		return findByPrimaryKey((Serializable)agricultureInspectionId);
	}

	/**
	 * Returns the agriculture inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection, or <code>null</code> if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public AgricultureInspection fetchByPrimaryKey(
		long agricultureInspectionId) {

		return fetchByPrimaryKey((Serializable)agricultureInspectionId);
	}

	/**
	 * Returns all the agriculture inspections.
	 *
	 * @return the agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findAll(
		int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture inspections
	 */
	@Override
	public List<AgricultureInspection> findAll(
		int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
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

		List<AgricultureInspection> list = null;

		if (useFinderCache) {
			list = (List<AgricultureInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREINSPECTION;

				sql = sql.concat(AgricultureInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureInspection>)QueryUtil.list(
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
	 * Removes all the agriculture inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureInspection agricultureInspection : findAll()) {
			remove(agricultureInspection);
		}
	}

	/**
	 * Returns the number of agriculture inspections.
	 *
	 * @return the number of agriculture inspections
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
					_SQL_COUNT_AGRICULTUREINSPECTION);

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
		return "agricultureInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture inspection persistence.
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

		_finderPathFetchBygetAgricultureInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAgricultureInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetAI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetAI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agriApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"agriApplicationId"}, true);

		_finderPathCountBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"agriApplicationId"}, false);

		_finderPathWithPaginationFindBygetAI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetAI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetAI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetAI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetAI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetAI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetAI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetAI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "agriApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "agriApplicationId"}, true);

		_finderPathCountBygetAI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "agriApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "agriApplicationId"
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
					"status", "slotBookedByUser", "agriApplicationId"
				},
				false);

		AgricultureInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureInspectionUtil.setPersistence(null);

		entityCache.removeCache(AgricultureInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRICULTUREINSPECTION =
		"SELECT agricultureInspection FROM AgricultureInspection agricultureInspection";

	private static final String _SQL_SELECT_AGRICULTUREINSPECTION_WHERE =
		"SELECT agricultureInspection FROM AgricultureInspection agricultureInspection WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREINSPECTION =
		"SELECT COUNT(agricultureInspection) FROM AgricultureInspection agricultureInspection";

	private static final String _SQL_COUNT_AGRICULTUREINSPECTION_WHERE =
		"SELECT COUNT(agricultureInspection) FROM AgricultureInspection agricultureInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}