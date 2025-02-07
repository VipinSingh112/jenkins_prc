/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbInspectionException;
import com.nbp.jtb.application.stage.services.model.JtbInspection;
import com.nbp.jtb.application.stage.services.model.JtbInspectionTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbInspectionImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbInspectionModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JtbInspectionPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbInspectionUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the jtb inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbInspectionPersistence.class)
public class JtbInspectionPersistenceImpl
	extends BasePersistenceImpl<JtbInspection>
	implements JtbInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbInspectionUtil</code> to access the jtb inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJtbyInspecBy_CI;
	private FinderPath _finderPathCountBygetJtbyInspecBy_CI;

	/**
	 * Returns the jtb inspection where caseId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtbyInspecBy_CI(String caseId)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtbyInspecBy_CI(caseId);

		if (jtbInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbInspectionException(sb.toString());
		}

		return jtbInspection;
	}

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtbyInspecBy_CI(String caseId) {
		return fetchBygetJtbyInspecBy_CI(caseId, true);
	}

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtbyInspecBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtbyInspecBy_CI, finderArgs, this);
		}

		if (result instanceof JtbInspection) {
			JtbInspection jtbInspection = (JtbInspection)result;

			if (!Objects.equals(caseId, jtbInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_2);
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

				List<JtbInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtbyInspecBy_CI, finderArgs,
							list);
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
								"JtbInspectionPersistenceImpl.fetchBygetJtbyInspecBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbInspection jtbInspection = list.get(0);

					result = jtbInspection;

					cacheResult(jtbInspection);
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
			return (JtbInspection)result;
		}
	}

	/**
	 * Removes the jtb inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb inspection that was removed
	 */
	@Override
	public JtbInspection removeBygetJtbyInspecBy_CI(String caseId)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = findBygetJtbyInspecBy_CI(caseId);

		return remove(jtbInspection);
	}

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtbyInspecBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtbyInspecBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_2 =
		"jtbInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTBYINSPECBY_CI_CASEID_3 =
		"(jtbInspection.caseId IS NULL OR jtbInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_FBAI;
	private FinderPath _finderPathCountBygetJtb_FBAI;

	/**
	 * Returns all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_FBAI(long jtbApplicationId) {
		return findBygetJtb_FBAI(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end) {

		return findBygetJtb_FBAI(jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findBygetJtb_FBAI(
			jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtb_FBAI;
				finderArgs = new Object[] {jtbApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_FBAI;
			finderArgs = new Object[] {
				jtbApplicationId, start, end, orderByComparator
			};
		}

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbInspection jtbInspection : list) {
					if (jtbApplicationId !=
							jtbInspection.getJtbApplicationId()) {

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

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_FBAI_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_FBAI_First(
			long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_FBAI_First(
			jtbApplicationId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_FBAI_First(
		long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		List<JtbInspection> list = findBygetJtb_FBAI(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_FBAI_Last(
			long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_FBAI_Last(
			jtbApplicationId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_FBAI_Last(
		long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		int count = countBygetJtb_FBAI(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbInspection> list = findBygetJtb_FBAI(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection[] findBygetJtb_FBAI_PrevAndNext(
			long jtbInspectionId, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = findByPrimaryKey(jtbInspectionId);

		Session session = null;

		try {
			session = openSession();

			JtbInspection[] array = new JtbInspectionImpl[3];

			array[0] = getBygetJtb_FBAI_PrevAndNext(
				session, jtbInspection, jtbApplicationId, orderByComparator,
				true);

			array[1] = jtbInspection;

			array[2] = getBygetJtb_FBAI_PrevAndNext(
				session, jtbInspection, jtbApplicationId, orderByComparator,
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

	protected JtbInspection getBygetJtb_FBAI_PrevAndNext(
		Session session, JtbInspection jtbInspection, long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETJTB_FBAI_JTBAPPLICATIONID_2);

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
			sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jtbApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb inspections where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetJtb_FBAI(long jtbApplicationId) {
		for (JtbInspection jtbInspection :
				findBygetJtb_FBAI(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtb_FBAI(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJtb_FBAI;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_FBAI_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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

	private static final String _FINDER_COLUMN_GETJTB_FBAI_JTBAPPLICATIONID_2 =
		"jtbInspection.jtbApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJtb_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_CaseId;
	private FinderPath _finderPathCountBygetJtb_CaseId;

	/**
	 * Returns all the jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseId(String caseId) {
		return findBygetJtb_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end) {

		return findBygetJtb_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findBygetJtb_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtb_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbInspection jtbInspection : list) {
					if (!caseId.equals(jtbInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CaseId_First(
			String caseId, OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CaseId_First(
			caseId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CaseId_First(
		String caseId, OrderByComparator<JtbInspection> orderByComparator) {

		List<JtbInspection> list = findBygetJtb_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CaseId_Last(
			String caseId, OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CaseId_Last(
			caseId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CaseId_Last(
		String caseId, OrderByComparator<JtbInspection> orderByComparator) {

		int count = countBygetJtb_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<JtbInspection> list = findBygetJtb_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection[] findBygetJtb_CaseId_PrevAndNext(
			long jtbInspectionId, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		caseId = Objects.toString(caseId, "");

		JtbInspection jtbInspection = findByPrimaryKey(jtbInspectionId);

		Session session = null;

		try {
			session = openSession();

			JtbInspection[] array = new JtbInspectionImpl[3];

			array[0] = getBygetJtb_CaseId_PrevAndNext(
				session, jtbInspection, caseId, orderByComparator, true);

			array[1] = jtbInspection;

			array[2] = getBygetJtb_CaseId_PrevAndNext(
				session, jtbInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JtbInspection getBygetJtb_CaseId_PrevAndNext(
		Session session, JtbInspection jtbInspection, String caseId,
		OrderByComparator<JtbInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_2);
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
			sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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
						jtbInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJtb_CaseId(String caseId) {
		for (JtbInspection jtbInspection :
				findBygetJtb_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtb_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtb_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_CASEID_CASEID_2 =
		"jtbInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_CASEID_CASEID_3 =
		"(jtbInspection.caseId IS NULL OR jtbInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_Status;
	private FinderPath _finderPathCountBygetJtb_Status;

	/**
	 * Returns all the jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_Status(String status) {
		return findBygetJtb_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end) {

		return findBygetJtb_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findBygetJtb_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtb_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbInspection jtbInspection : list) {
					if (!status.equals(jtbInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_Status_First(
			String status, OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_Status_First(
			status, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_Status_First(
		String status, OrderByComparator<JtbInspection> orderByComparator) {

		List<JtbInspection> list = findBygetJtb_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_Status_Last(
			String status, OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_Status_Last(
			status, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_Status_Last(
		String status, OrderByComparator<JtbInspection> orderByComparator) {

		int count = countBygetJtb_Status(status);

		if (count == 0) {
			return null;
		}

		List<JtbInspection> list = findBygetJtb_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection[] findBygetJtb_Status_PrevAndNext(
			long jtbInspectionId, String status,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		status = Objects.toString(status, "");

		JtbInspection jtbInspection = findByPrimaryKey(jtbInspectionId);

		Session session = null;

		try {
			session = openSession();

			JtbInspection[] array = new JtbInspectionImpl[3];

			array[0] = getBygetJtb_Status_PrevAndNext(
				session, jtbInspection, status, orderByComparator, true);

			array[1] = jtbInspection;

			array[2] = getBygetJtb_Status_PrevAndNext(
				session, jtbInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JtbInspection getBygetJtb_Status_PrevAndNext(
		Session session, JtbInspection jtbInspection, String status,
		OrderByComparator<JtbInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_2);
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
			sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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
						jtbInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetJtb_Status(String status) {
		for (JtbInspection jtbInspection :
				findBygetJtb_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtb_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetJtb_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETJTB_STATUS_STATUS_2 =
		"jtbInspection.status = ?";

	private static final String _FINDER_COLUMN_GETJTB_STATUS_STATUS_3 =
		"(jtbInspection.status IS NULL OR jtbInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_CaseIdStatus;
	private FinderPath _finderPathCountBygetJtb_CaseIdStatus;

	/**
	 * Returns all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId) {

		return findBygetJtb_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetJtb_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findBygetJtb_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJtb_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbInspection jtbInspection : list) {
					if (!status.equals(jtbInspection.getStatus()) ||
						!caseId.equals(jtbInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<JtbInspection> orderByComparator) {

		List<JtbInspection> list = findBygetJtb_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<JtbInspection> orderByComparator) {

		int count = countBygetJtb_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<JtbInspection> list = findBygetJtb_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection[] findBygetJtb_CaseIdStatus_PrevAndNext(
			long jtbInspectionId, String status, String caseId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		JtbInspection jtbInspection = findByPrimaryKey(jtbInspectionId);

		Session session = null;

		try {
			session = openSession();

			JtbInspection[] array = new JtbInspectionImpl[3];

			array[0] = getBygetJtb_CaseIdStatus_PrevAndNext(
				session, jtbInspection, status, caseId, orderByComparator,
				true);

			array[1] = jtbInspection;

			array[2] = getBygetJtb_CaseIdStatus_PrevAndNext(
				session, jtbInspection, status, caseId, orderByComparator,
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

	protected JtbInspection getBygetJtb_CaseIdStatus_PrevAndNext(
		Session session, JtbInspection jtbInspection, String status,
		String caseId, OrderByComparator<JtbInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_2);
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
			sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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
						jtbInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJtb_CaseIdStatus(String status, String caseId) {
		for (JtbInspection jtbInspection :
				findBygetJtb_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtb_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtb_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_2 =
		"jtbInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETJTB_CASEIDSTATUS_STATUS_3 =
		"(jtbInspection.status IS NULL OR jtbInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_2 =
		"jtbInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_CASEIDSTATUS_CASEID_3 =
		"(jtbInspection.caseId IS NULL OR jtbInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtb_CIAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetJtb_CIAppId;
	private FinderPath _finderPathCountBygetJtb_CIAppId;

	/**
	 * Returns all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId) {

		return findBygetJtb_CIAppId(
			status, jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end) {

		return findBygetJtb_CIAppId(status, jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findBygetJtb_CIAppId(
			status, jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	@Override
	public List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		OrderByComparator<JtbInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtb_CIAppId;
				finderArgs = new Object[] {status, jtbApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtb_CIAppId;
			finderArgs = new Object[] {
				status, jtbApplicationId, start, end, orderByComparator
			};
		}

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbInspection jtbInspection : list) {
					if (!status.equals(jtbInspection.getStatus()) ||
						(jtbApplicationId !=
							jtbInspection.getJtbApplicationId())) {

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

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(jtbApplicationId);

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CIAppId_First(
			String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CIAppId_First(
			status, jtbApplicationId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CIAppId_First(
		String status, long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		List<JtbInspection> list = findBygetJtb_CIAppId(
			status, jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtb_CIAppId_Last(
			String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtb_CIAppId_Last(
			status, jtbApplicationId, orderByComparator);

		if (jtbInspection != null) {
			return jtbInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbInspectionException(sb.toString());
	}

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtb_CIAppId_Last(
		String status, long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator) {

		int count = countBygetJtb_CIAppId(status, jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbInspection> list = findBygetJtb_CIAppId(
			status, jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection[] findBygetJtb_CIAppId_PrevAndNext(
			long jtbInspectionId, String status, long jtbApplicationId,
			OrderByComparator<JtbInspection> orderByComparator)
		throws NoSuchJtbInspectionException {

		status = Objects.toString(status, "");

		JtbInspection jtbInspection = findByPrimaryKey(jtbInspectionId);

		Session session = null;

		try {
			session = openSession();

			JtbInspection[] array = new JtbInspectionImpl[3];

			array[0] = getBygetJtb_CIAppId_PrevAndNext(
				session, jtbInspection, status, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbInspection;

			array[2] = getBygetJtb_CIAppId_PrevAndNext(
				session, jtbInspection, status, jtbApplicationId,
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

	protected JtbInspection getBygetJtb_CIAppId_PrevAndNext(
		Session session, JtbInspection jtbInspection, String status,
		long jtbApplicationId,
		OrderByComparator<JtbInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_JTBAPPLICATIONID_2);

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
			sb.append(JtbInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(jtbApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb inspections where status = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetJtb_CIAppId(String status, long jtbApplicationId) {
		for (JtbInspection jtbInspection :
				findBygetJtb_CIAppId(
					status, jtbApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtb_CIAppId(String status, long jtbApplicationId) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetJtb_CIAppId;

		Object[] finderArgs = new Object[] {status, jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETJTB_CIAPPID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(jtbApplicationId);

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

	private static final String _FINDER_COLUMN_GETJTB_CIAPPID_STATUS_2 =
		"jtbInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETJTB_CIAPPID_STATUS_3 =
		"(jtbInspection.status IS NULL OR jtbInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_CIAPPID_JTBAPPLICATIONID_2 =
			"jtbInspection.jtbApplicationId = ?";

	private FinderPath _finderPathFetchBygetJtbByStatus_Slot_AppId;
	private FinderPath _finderPathCountBygetJtbByStatus_Slot_AppId;

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection findBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);

		if (jtbInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbInspectionException(sb.toString());
		}

		return jtbInspection;
	}

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId) {

		return fetchBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId, true);
	}

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	@Override
	public JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, jtbApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtbByStatus_Slot_AppId, finderArgs, this);
		}

		if (result instanceof JtbInspection) {
			JtbInspection jtbInspection = (JtbInspection)result;

			if (!Objects.equals(status, jtbInspection.getStatus()) ||
				(slotBookedByUser != jtbInspection.getSlotBookedByUser()) ||
				(jtbApplicationId != jtbInspection.getJtbApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_JTBAPPLICATIONID_2);

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

				queryPos.add(jtbApplicationId);

				List<JtbInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtbByStatus_Slot_AppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser, jtbApplicationId
								};
							}

							_log.warn(
								"JtbInspectionPersistenceImpl.fetchBygetJtbByStatus_Slot_AppId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbInspection jtbInspection = list.get(0);

					result = jtbInspection;

					cacheResult(jtbInspection);
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
			return (JtbInspection)result;
		}
	}

	/**
	 * Removes the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb inspection that was removed
	 */
	@Override
	public JtbInspection removeBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = findBygetJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);

		return remove(jtbInspection);
	}

	/**
	 * Returns the number of jtb inspections where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	@Override
	public int countBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetJtbByStatus_Slot_AppId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, jtbApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_JTBINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_JTBAPPLICATIONID_2);

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

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_2 =
			"jtbInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_STATUS_3 =
			"(jtbInspection.status IS NULL OR jtbInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_SLOTBOOKEDBYUSER_2 =
			"jtbInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTBBYSTATUS_SLOT_APPID_JTBAPPLICATIONID_2 =
			"jtbInspection.jtbApplicationId = ?";

	public JtbInspectionPersistenceImpl() {
		setModelClass(JtbInspection.class);

		setModelImplClass(JtbInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(JtbInspectionTable.INSTANCE);
	}

	/**
	 * Caches the jtb inspection in the entity cache if it is enabled.
	 *
	 * @param jtbInspection the jtb inspection
	 */
	@Override
	public void cacheResult(JtbInspection jtbInspection) {
		entityCache.putResult(
			JtbInspectionImpl.class, jtbInspection.getPrimaryKey(),
			jtbInspection);

		finderCache.putResult(
			_finderPathFetchBygetJtbyInspecBy_CI,
			new Object[] {jtbInspection.getCaseId()}, jtbInspection);

		finderCache.putResult(
			_finderPathFetchBygetJtbByStatus_Slot_AppId,
			new Object[] {
				jtbInspection.getStatus(), jtbInspection.getSlotBookedByUser(),
				jtbInspection.getJtbApplicationId()
			},
			jtbInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb inspections in the entity cache if it is enabled.
	 *
	 * @param jtbInspections the jtb inspections
	 */
	@Override
	public void cacheResult(List<JtbInspection> jtbInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbInspection jtbInspection : jtbInspections) {
			if (entityCache.getResult(
					JtbInspectionImpl.class, jtbInspection.getPrimaryKey()) ==
						null) {

				cacheResult(jtbInspection);
			}
		}
	}

	/**
	 * Clears the cache for all jtb inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbInspectionImpl.class);

		finderCache.clearCache(JtbInspectionImpl.class);
	}

	/**
	 * Clears the cache for the jtb inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbInspection jtbInspection) {
		entityCache.removeResult(JtbInspectionImpl.class, jtbInspection);
	}

	@Override
	public void clearCache(List<JtbInspection> jtbInspections) {
		for (JtbInspection jtbInspection : jtbInspections) {
			entityCache.removeResult(JtbInspectionImpl.class, jtbInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JtbInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbInspectionModelImpl jtbInspectionModelImpl) {

		Object[] args = new Object[] {jtbInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJtbyInspecBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtbyInspecBy_CI, args, jtbInspectionModelImpl);

		args = new Object[] {
			jtbInspectionModelImpl.getStatus(),
			jtbInspectionModelImpl.getSlotBookedByUser(),
			jtbInspectionModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJtbByStatus_Slot_AppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtbByStatus_Slot_AppId, args,
			jtbInspectionModelImpl);
	}

	/**
	 * Creates a new jtb inspection with the primary key. Does not add the jtb inspection to the database.
	 *
	 * @param jtbInspectionId the primary key for the new jtb inspection
	 * @return the new jtb inspection
	 */
	@Override
	public JtbInspection create(long jtbInspectionId) {
		JtbInspection jtbInspection = new JtbInspectionImpl();

		jtbInspection.setNew(true);
		jtbInspection.setPrimaryKey(jtbInspectionId);

		jtbInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbInspection;
	}

	/**
	 * Removes the jtb inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection that was removed
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection remove(long jtbInspectionId)
		throws NoSuchJtbInspectionException {

		return remove((Serializable)jtbInspectionId);
	}

	/**
	 * Removes the jtb inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb inspection
	 * @return the jtb inspection that was removed
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection remove(Serializable primaryKey)
		throws NoSuchJtbInspectionException {

		Session session = null;

		try {
			session = openSession();

			JtbInspection jtbInspection = (JtbInspection)session.get(
				JtbInspectionImpl.class, primaryKey);

			if (jtbInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbInspection);
		}
		catch (NoSuchJtbInspectionException noSuchEntityException) {
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
	protected JtbInspection removeImpl(JtbInspection jtbInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbInspection)) {
				jtbInspection = (JtbInspection)session.get(
					JtbInspectionImpl.class, jtbInspection.getPrimaryKeyObj());
			}

			if (jtbInspection != null) {
				session.delete(jtbInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbInspection != null) {
			clearCache(jtbInspection);
		}

		return jtbInspection;
	}

	@Override
	public JtbInspection updateImpl(JtbInspection jtbInspection) {
		boolean isNew = jtbInspection.isNew();

		if (!(jtbInspection instanceof JtbInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbInspection implementation " +
					jtbInspection.getClass());
		}

		JtbInspectionModelImpl jtbInspectionModelImpl =
			(JtbInspectionModelImpl)jtbInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbInspection.setCreateDate(date);
			}
			else {
				jtbInspection.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!jtbInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbInspection.setModifiedDate(date);
			}
			else {
				jtbInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbInspection);
			}
			else {
				jtbInspection = (JtbInspection)session.merge(jtbInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbInspectionImpl.class, jtbInspectionModelImpl, false, true);

		cacheUniqueFindersCache(jtbInspectionModelImpl);

		if (isNew) {
			jtbInspection.setNew(false);
		}

		jtbInspection.resetOriginalValues();

		return jtbInspection;
	}

	/**
	 * Returns the jtb inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb inspection
	 * @return the jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbInspectionException {

		JtbInspection jtbInspection = fetchByPrimaryKey(primaryKey);

		if (jtbInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbInspection;
	}

	/**
	 * Returns the jtb inspection with the primary key or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection findByPrimaryKey(long jtbInspectionId)
		throws NoSuchJtbInspectionException {

		return findByPrimaryKey((Serializable)jtbInspectionId);
	}

	/**
	 * Returns the jtb inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection, or <code>null</code> if a jtb inspection with the primary key could not be found
	 */
	@Override
	public JtbInspection fetchByPrimaryKey(long jtbInspectionId) {
		return fetchByPrimaryKey((Serializable)jtbInspectionId);
	}

	/**
	 * Returns all the jtb inspections.
	 *
	 * @return the jtb inspections
	 */
	@Override
	public List<JtbInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of jtb inspections
	 */
	@Override
	public List<JtbInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb inspections
	 */
	@Override
	public List<JtbInspection> findAll(
		int start, int end,
		OrderByComparator<JtbInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb inspections
	 */
	@Override
	public List<JtbInspection> findAll(
		int start, int end, OrderByComparator<JtbInspection> orderByComparator,
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

		List<JtbInspection> list = null;

		if (useFinderCache) {
			list = (List<JtbInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBINSPECTION;

				sql = sql.concat(JtbInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbInspection>)QueryUtil.list(
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
	 * Removes all the jtb inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbInspection jtbInspection : findAll()) {
			remove(jtbInspection);
		}
	}

	/**
	 * Returns the number of jtb inspections.
	 *
	 * @return the number of jtb inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JTBINSPECTION);

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
		return "jtbInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb inspection persistence.
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

		_finderPathFetchBygetJtbyInspecBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtbyInspecBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtbyInspecBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbyInspecBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJtb_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jtbApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJtb_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtb_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJtb_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		_finderPathWithPaginationFindBygetJtb_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJtb_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtb_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtb_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJtb_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetJtb_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtb_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetJtb_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetJtb_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetJtb_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJtb_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetJtb_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtb_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetJtb_CIAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtb_CIAppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "jtbApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJtb_CIAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtb_CIAppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "jtbApplicationId"}, true);

		_finderPathCountBygetJtb_CIAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJtb_CIAppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "jtbApplicationId"}, false);

		_finderPathFetchBygetJtbByStatus_Slot_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtbByStatus_Slot_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "jtbApplicationId"},
			true);

		_finderPathCountBygetJtbByStatus_Slot_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbByStatus_Slot_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "jtbApplicationId"},
			false);

		JtbInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbInspectionUtil.setPersistence(null);

		entityCache.removeCache(JtbInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBINSPECTION =
		"SELECT jtbInspection FROM JtbInspection jtbInspection";

	private static final String _SQL_SELECT_JTBINSPECTION_WHERE =
		"SELECT jtbInspection FROM JtbInspection jtbInspection WHERE ";

	private static final String _SQL_COUNT_JTBINSPECTION =
		"SELECT COUNT(jtbInspection) FROM JtbInspection jtbInspection";

	private static final String _SQL_COUNT_JTBINSPECTION_WHERE =
		"SELECT COUNT(jtbInspection) FROM JtbInspection jtbInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}