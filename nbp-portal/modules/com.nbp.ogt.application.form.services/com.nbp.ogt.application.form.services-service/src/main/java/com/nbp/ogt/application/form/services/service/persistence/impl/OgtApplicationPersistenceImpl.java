/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtApplicationException;
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.model.OgtApplicationTable;
import com.nbp.ogt.application.form.services.model.impl.OgtApplicationImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtApplicationPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtApplicationUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtApplicationPersistence.class)
public class OgtApplicationPersistenceImpl
	extends BasePersistenceImpl<OgtApplication>
	implements OgtApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtApplicationUtil</code> to access the ogt application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOgtByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetOgtByS_U;
	private FinderPath _finderPathCountBygetOgtByS_U;

	/**
	 * Returns all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByS_U(long userId, int status) {
		return findBygetOgtByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end) {

		return findBygetOgtByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return findBygetOgtByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOgtByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgtByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<OgtApplication> list = null;

		if (useFinderCache) {
			list = (List<OgtApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplication ogtApplication : list) {
					if ((userId != ogtApplication.getUserId()) ||
						(status != ogtApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETOGTBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<OgtApplication>)QueryUtil.list(
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
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByS_U_First(
			long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByS_U_First(
			userId, status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByS_U_First(
		long userId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		List<OgtApplication> list = findBygetOgtByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByS_U_Last(
			long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByS_U_Last(
			userId, status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByS_U_Last(
		long userId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		int count = countBygetOgtByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<OgtApplication> list = findBygetOgtByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication[] findBygetOgtByS_U_PrevAndNext(
			long ogtApplicationId, long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findByPrimaryKey(ogtApplicationId);

		Session session = null;

		try {
			session = openSession();

			OgtApplication[] array = new OgtApplicationImpl[3];

			array[0] = getBygetOgtByS_U_PrevAndNext(
				session, ogtApplication, userId, status, orderByComparator,
				true);

			array[1] = ogtApplication;

			array[2] = getBygetOgtByS_U_PrevAndNext(
				session, ogtApplication, userId, status, orderByComparator,
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

	protected OgtApplication getBygetOgtByS_U_PrevAndNext(
		Session session, OgtApplication ogtApplication, long userId, int status,
		OrderByComparator<OgtApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOGTBYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETOGTBYS_U_STATUS_2);

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
			sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ogtApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOgtByS_U(long userId, int status) {
		for (OgtApplication ogtApplication :
				findBygetOgtByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ogtApplication);
		}
	}

	/**
	 * Returns the number of ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetOgtByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETOGTBYS_U_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETOGTBYS_U_USERID_2 =
		"ogtApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETOGTBYS_U_STATUS_2 =
		"ogtApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetOgtByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetOgtByStatus;
	private FinderPath _finderPathCountBygetOgtByStatus;

	/**
	 * Returns all the ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByStatus(int status) {
		return findBygetOgtByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end) {

		return findBygetOgtByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return findBygetOgtByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOgtByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgtByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<OgtApplication> list = null;

		if (useFinderCache) {
			list = (List<OgtApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplication ogtApplication : list) {
					if (status != ogtApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<OgtApplication>)QueryUtil.list(
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
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByStatus_First(
			int status, OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByStatus_First(
			status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByStatus_First(
		int status, OrderByComparator<OgtApplication> orderByComparator) {

		List<OgtApplication> list = findBygetOgtByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByStatus_Last(
			int status, OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByStatus_Last(
			status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByStatus_Last(
		int status, OrderByComparator<OgtApplication> orderByComparator) {

		int count = countBygetOgtByStatus(status);

		if (count == 0) {
			return null;
		}

		List<OgtApplication> list = findBygetOgtByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication[] findBygetOgtByStatus_PrevAndNext(
			long ogtApplicationId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findByPrimaryKey(ogtApplicationId);

		Session session = null;

		try {
			session = openSession();

			OgtApplication[] array = new OgtApplicationImpl[3];

			array[0] = getBygetOgtByStatus_PrevAndNext(
				session, ogtApplication, status, orderByComparator, true);

			array[1] = ogtApplication;

			array[2] = getBygetOgtByStatus_PrevAndNext(
				session, ogtApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OgtApplication getBygetOgtByStatus_PrevAndNext(
		Session session, OgtApplication ogtApplication, int status,
		OrderByComparator<OgtApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOGTBYSTATUS_STATUS_2);

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
			sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ogtApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetOgtByStatus(int status) {
		for (OgtApplication ogtApplication :
				findBygetOgtByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtApplication);
		}
	}

	/**
	 * Returns the number of ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetOgtByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYSTATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETOGTBYSTATUS_STATUS_2 =
		"ogtApplication.status = ?";

	private FinderPath _finderPathFetchBygetOgtByAppNum;
	private FinderPath _finderPathCountBygetOgtByAppNum;

	/**
	 * Returns the ogt application where applicationNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByAppNum(String applicationNumber)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByAppNum(
			applicationNumber);

		if (ogtApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationException(sb.toString());
		}

		return ogtApplication;
	}

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByAppNum(String applicationNumber) {
		return fetchBygetOgtByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtByAppNum, finderArgs, this);
		}

		if (result instanceof OgtApplication) {
			OgtApplication ogtApplication = (OgtApplication)result;

			if (!Objects.equals(
					applicationNumber, ogtApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<OgtApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtByAppNum, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"OgtApplicationPersistenceImpl.fetchBygetOgtByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplication ogtApplication = list.get(0);

					result = ogtApplication;

					cacheResult(ogtApplication);
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
			return (OgtApplication)result;
		}
	}

	/**
	 * Removes the ogt application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ogt application that was removed
	 */
	@Override
	public OgtApplication removeBygetOgtByAppNum(String applicationNumber)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findBygetOgtByAppNum(applicationNumber);

		return remove(ogtApplication);
	}

	/**
	 * Returns the number of ogt applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetOgtByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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
		_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_2 =
			"ogtApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOGTBYAPPNUM_APPLICATIONNUMBER_3 =
			"(ogtApplication.applicationNumber IS NULL OR ogtApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetOgtByCaseId;
	private FinderPath _finderPathCountBygetOgtByCaseId;

	/**
	 * Returns the ogt application where caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByCaseId(String caseId)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByCaseId(caseId);

		if (ogtApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationException(sb.toString());
		}

		return ogtApplication;
	}

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByCaseId(String caseId) {
		return fetchBygetOgtByCaseId(caseId, true);
	}

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtByCaseId, finderArgs, this);
		}

		if (result instanceof OgtApplication) {
			OgtApplication ogtApplication = (OgtApplication)result;

			if (!Objects.equals(caseId, ogtApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYCASEID_CASEID_2);
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

				List<OgtApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtByCaseId, finderArgs, list);
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
								"OgtApplicationPersistenceImpl.fetchBygetOgtByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplication ogtApplication = list.get(0);

					result = ogtApplication;

					cacheResult(ogtApplication);
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
			return (OgtApplication)result;
		}
	}

	/**
	 * Removes the ogt application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	@Override
	public OgtApplication removeBygetOgtByCaseId(String caseId)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findBygetOgtByCaseId(caseId);

		return remove(ogtApplication);
	}

	/**
	 * Returns the number of ogt applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOgtByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOGTBYCASEID_CASEID_2 =
		"ogtApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOGTBYCASEID_CASEID_3 =
		"(ogtApplication.caseId IS NULL OR ogtApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOgtByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetOgtByEntityId;
	private FinderPath _finderPathCountBygetOgtByEntityId;

	/**
	 * Returns all the ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId(String entityId) {
		return findBygetOgtByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end) {

		return findBygetOgtByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return findBygetOgtByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOgtByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgtByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<OgtApplication> list = null;

		if (useFinderCache) {
			list = (List<OgtApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplication ogtApplication : list) {
					if (!entityId.equals(ogtApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				list = (List<OgtApplication>)QueryUtil.list(
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
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByEntityId_First(
			String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByEntityId_First(
			entityId, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEntityId_First(
		String entityId, OrderByComparator<OgtApplication> orderByComparator) {

		List<OgtApplication> list = findBygetOgtByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByEntityId_Last(
			String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByEntityId_Last(
			entityId, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEntityId_Last(
		String entityId, OrderByComparator<OgtApplication> orderByComparator) {

		int count = countBygetOgtByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<OgtApplication> list = findBygetOgtByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication[] findBygetOgtByEntityId_PrevAndNext(
			long ogtApplicationId, String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		entityId = Objects.toString(entityId, "");

		OgtApplication ogtApplication = findByPrimaryKey(ogtApplicationId);

		Session session = null;

		try {
			session = openSession();

			OgtApplication[] array = new OgtApplicationImpl[3];

			array[0] = getBygetOgtByEntityId_PrevAndNext(
				session, ogtApplication, entityId, orderByComparator, true);

			array[1] = ogtApplication;

			array[2] = getBygetOgtByEntityId_PrevAndNext(
				session, ogtApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OgtApplication getBygetOgtByEntityId_PrevAndNext(
		Session session, OgtApplication ogtApplication, String entityId,
		OrderByComparator<OgtApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_2);
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
			sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ogtApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetOgtByEntityId(String entityId) {
		for (OgtApplication ogtApplication :
				findBygetOgtByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ogtApplication);
		}
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetOgtByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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

	private static final String _FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_2 =
		"ogtApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETOGTBYENTITYID_ENTITYID_3 =
		"(ogtApplication.entityId IS NULL OR ogtApplication.entityId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOgtByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOgtByEntityId_Status;
	private FinderPath _finderPathCountBygetOgtByEntityId_Status;

	/**
	 * Returns all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status) {

		return findBygetOgtByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetOgtByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return findBygetOgtByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	@Override
	public List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOgtByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOgtByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<OgtApplication> list = null;

		if (useFinderCache) {
			list = (List<OgtApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OgtApplication ogtApplication : list) {
					if (!entityId.equals(ogtApplication.getEntityId()) ||
						(status != ogtApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				queryPos.add(status);

				list = (List<OgtApplication>)QueryUtil.list(
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
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByEntityId_Status_First(
			entityId, status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		List<OgtApplication> list = findBygetOgtByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByEntityId_Status_Last(
			entityId, status, orderByComparator);

		if (ogtApplication != null) {
			return ogtApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOgtApplicationException(sb.toString());
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		int count = countBygetOgtByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<OgtApplication> list = findBygetOgtByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication[] findBygetOgtByEntityId_Status_PrevAndNext(
			long ogtApplicationId, String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws NoSuchOgtApplicationException {

		entityId = Objects.toString(entityId, "");

		OgtApplication ogtApplication = findByPrimaryKey(ogtApplicationId);

		Session session = null;

		try {
			session = openSession();

			OgtApplication[] array = new OgtApplicationImpl[3];

			array[0] = getBygetOgtByEntityId_Status_PrevAndNext(
				session, ogtApplication, entityId, status, orderByComparator,
				true);

			array[1] = ogtApplication;

			array[2] = getBygetOgtByEntityId_Status_PrevAndNext(
				session, ogtApplication, entityId, status, orderByComparator,
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

	protected OgtApplication getBygetOgtByEntityId_Status_PrevAndNext(
		Session session, OgtApplication ogtApplication, String entityId,
		int status, OrderByComparator<OgtApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_STATUS_2);

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
			sb.append(OgtApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ogtApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OgtApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ogt applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOgtByEntityId_Status(String entityId, int status) {
		for (OgtApplication ogtApplication :
				findBygetOgtByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ogtApplication);
		}
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetOgtByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				queryPos.add(status);

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
		_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_2 =
			"ogtApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_ENTITYID_3 =
			"(ogtApplication.entityId IS NULL OR ogtApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGTBYENTITYID_STATUS_STATUS_2 =
			"ogtApplication.status = ?";

	private FinderPath _finderPathFetchBygetOgtByEI_CI;
	private FinderPath _finderPathCountBygetOgtByEI_CI;

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByEI_CI(String entityId, String caseId)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByEI_CI(entityId, caseId);

		if (ogtApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("entityId=");
			sb.append(entityId);

			sb.append(", caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationException(sb.toString());
		}

		return ogtApplication;
	}

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEI_CI(String entityId, String caseId) {
		return fetchBygetOgtByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {entityId, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtByEI_CI, finderArgs, this);
		}

		if (result instanceof OgtApplication) {
			OgtApplication ogtApplication = (OgtApplication)result;

			if (!Objects.equals(entityId, ogtApplication.getEntityId()) ||
				!Objects.equals(caseId, ogtApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<OgtApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtByEI_CI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {entityId, caseId};
							}

							_log.warn(
								"OgtApplicationPersistenceImpl.fetchBygetOgtByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplication ogtApplication = list.get(0);

					result = ogtApplication;

					cacheResult(ogtApplication);
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
			return (OgtApplication)result;
		}
	}

	/**
	 * Removes the ogt application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	@Override
	public OgtApplication removeBygetOgtByEI_CI(String entityId, String caseId)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findBygetOgtByEI_CI(entityId, caseId);

		return remove(ogtApplication);
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOgtByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOGTBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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

	private static final String _FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_2 =
		"ogtApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETOGTBYEI_CI_ENTITYID_3 =
		"(ogtApplication.entityId IS NULL OR ogtApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETOGTBYEI_CI_CASEID_2 =
		"ogtApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOGTBYEI_CI_CASEID_3 =
		"(ogtApplication.caseId IS NULL OR ogtApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetOgtByRT_AppNo;
	private FinderPath _finderPathCountBygetOgtByRT_AppNo;

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication findBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);

		if (ogtApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfApplicant=");
			sb.append(typeOfApplicant);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtApplicationException(sb.toString());
		}

		return ogtApplication;
	}

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return fetchBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	@Override
	public OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfApplicant, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtByRT_AppNo, finderArgs, this);
		}

		if (result instanceof OgtApplication) {
			OgtApplication ogtApplication = (OgtApplication)result;

			if (!Objects.equals(
					typeOfApplicant, ogtApplication.getTypeOfApplicant()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					ogtApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OGTAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<OgtApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfApplicant, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"OgtApplicationPersistenceImpl.fetchBygetOgtByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtApplication ogtApplication = list.get(0);

					result = ogtApplication;

					cacheResult(ogtApplication);
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
			return (OgtApplication)result;
		}
	}

	/**
	 * Removes the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ogt application that was removed
	 */
	@Override
	public OgtApplication removeBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = findBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);

		return remove(ogtApplication);
	}

	/**
	 * Returns the number of ogt applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ogt applications
	 */
	@Override
	public int countBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetOgtByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfApplicant, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OGTAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
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
		_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_2 =
			"ogtApplication.typeOfApplicant = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOGTBYRT_APPNO_TYPEOFAPPLICANT_3 =
			"(ogtApplication.typeOfApplicant IS NULL OR ogtApplication.typeOfApplicant = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"ogtApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOGTBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(ogtApplication.expiredLicenseAppNumber IS NULL OR ogtApplication.expiredLicenseAppNumber = '')";

	public OgtApplicationPersistenceImpl() {
		setModelClass(OgtApplication.class);

		setModelImplClass(OgtApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(OgtApplicationTable.INSTANCE);
	}

	/**
	 * Caches the ogt application in the entity cache if it is enabled.
	 *
	 * @param ogtApplication the ogt application
	 */
	@Override
	public void cacheResult(OgtApplication ogtApplication) {
		entityCache.putResult(
			OgtApplicationImpl.class, ogtApplication.getPrimaryKey(),
			ogtApplication);

		finderCache.putResult(
			_finderPathFetchBygetOgtByAppNum,
			new Object[] {ogtApplication.getApplicationNumber()},
			ogtApplication);

		finderCache.putResult(
			_finderPathFetchBygetOgtByCaseId,
			new Object[] {ogtApplication.getCaseId()}, ogtApplication);

		finderCache.putResult(
			_finderPathFetchBygetOgtByEI_CI,
			new Object[] {
				ogtApplication.getEntityId(), ogtApplication.getCaseId()
			},
			ogtApplication);

		finderCache.putResult(
			_finderPathFetchBygetOgtByRT_AppNo,
			new Object[] {
				ogtApplication.getTypeOfApplicant(),
				ogtApplication.getExpiredLicenseAppNumber()
			},
			ogtApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt applications in the entity cache if it is enabled.
	 *
	 * @param ogtApplications the ogt applications
	 */
	@Override
	public void cacheResult(List<OgtApplication> ogtApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtApplications.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtApplication ogtApplication : ogtApplications) {
			if (entityCache.getResult(
					OgtApplicationImpl.class, ogtApplication.getPrimaryKey()) ==
						null) {

				cacheResult(ogtApplication);
			}
		}
	}

	/**
	 * Clears the cache for all ogt applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtApplicationImpl.class);

		finderCache.clearCache(OgtApplicationImpl.class);
	}

	/**
	 * Clears the cache for the ogt application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtApplication ogtApplication) {
		entityCache.removeResult(OgtApplicationImpl.class, ogtApplication);
	}

	@Override
	public void clearCache(List<OgtApplication> ogtApplications) {
		for (OgtApplication ogtApplication : ogtApplications) {
			entityCache.removeResult(OgtApplicationImpl.class, ogtApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtApplicationModelImpl ogtApplicationModelImpl) {

		Object[] args = new Object[] {
			ogtApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtByAppNum, args, ogtApplicationModelImpl);

		args = new Object[] {ogtApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOgtByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtByCaseId, args, ogtApplicationModelImpl);

		args = new Object[] {
			ogtApplicationModelImpl.getEntityId(),
			ogtApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtByEI_CI, args, ogtApplicationModelImpl);

		args = new Object[] {
			ogtApplicationModelImpl.getTypeOfApplicant(),
			ogtApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtByRT_AppNo, args, ogtApplicationModelImpl);
	}

	/**
	 * Creates a new ogt application with the primary key. Does not add the ogt application to the database.
	 *
	 * @param ogtApplicationId the primary key for the new ogt application
	 * @return the new ogt application
	 */
	@Override
	public OgtApplication create(long ogtApplicationId) {
		OgtApplication ogtApplication = new OgtApplicationImpl();

		ogtApplication.setNew(true);
		ogtApplication.setPrimaryKey(ogtApplicationId);

		ogtApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtApplication;
	}

	/**
	 * Removes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication remove(long ogtApplicationId)
		throws NoSuchOgtApplicationException {

		return remove((Serializable)ogtApplicationId);
	}

	/**
	 * Removes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication remove(Serializable primaryKey)
		throws NoSuchOgtApplicationException {

		Session session = null;

		try {
			session = openSession();

			OgtApplication ogtApplication = (OgtApplication)session.get(
				OgtApplicationImpl.class, primaryKey);

			if (ogtApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtApplication);
		}
		catch (NoSuchOgtApplicationException noSuchEntityException) {
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
	protected OgtApplication removeImpl(OgtApplication ogtApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtApplication)) {
				ogtApplication = (OgtApplication)session.get(
					OgtApplicationImpl.class,
					ogtApplication.getPrimaryKeyObj());
			}

			if (ogtApplication != null) {
				session.delete(ogtApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtApplication != null) {
			clearCache(ogtApplication);
		}

		return ogtApplication;
	}

	@Override
	public OgtApplication updateImpl(OgtApplication ogtApplication) {
		boolean isNew = ogtApplication.isNew();

		if (!(ogtApplication instanceof OgtApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtApplication implementation " +
					ogtApplication.getClass());
		}

		OgtApplicationModelImpl ogtApplicationModelImpl =
			(OgtApplicationModelImpl)ogtApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtApplication.setCreateDate(date);
			}
			else {
				ogtApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtApplication.setModifiedDate(date);
			}
			else {
				ogtApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtApplication);
			}
			else {
				ogtApplication = (OgtApplication)session.merge(ogtApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtApplicationImpl.class, ogtApplicationModelImpl, false, true);

		cacheUniqueFindersCache(ogtApplicationModelImpl);

		if (isNew) {
			ogtApplication.setNew(false);
		}

		ogtApplication.resetOriginalValues();

		return ogtApplication;
	}

	/**
	 * Returns the ogt application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt application
	 * @return the ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtApplicationException {

		OgtApplication ogtApplication = fetchByPrimaryKey(primaryKey);

		if (ogtApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtApplication;
	}

	/**
	 * Returns the ogt application with the primary key or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication findByPrimaryKey(long ogtApplicationId)
		throws NoSuchOgtApplicationException {

		return findByPrimaryKey((Serializable)ogtApplicationId);
	}

	/**
	 * Returns the ogt application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application, or <code>null</code> if a ogt application with the primary key could not be found
	 */
	@Override
	public OgtApplication fetchByPrimaryKey(long ogtApplicationId) {
		return fetchByPrimaryKey((Serializable)ogtApplicationId);
	}

	/**
	 * Returns all the ogt applications.
	 *
	 * @return the ogt applications
	 */
	@Override
	public List<OgtApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of ogt applications
	 */
	@Override
	public List<OgtApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt applications
	 */
	@Override
	public List<OgtApplication> findAll(
		int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt applications
	 */
	@Override
	public List<OgtApplication> findAll(
		int start, int end, OrderByComparator<OgtApplication> orderByComparator,
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

		List<OgtApplication> list = null;

		if (useFinderCache) {
			list = (List<OgtApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTAPPLICATION;

				sql = sql.concat(OgtApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtApplication>)QueryUtil.list(
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
	 * Removes all the ogt applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtApplication ogtApplication : findAll()) {
			remove(ogtApplication);
		}
	}

	/**
	 * Returns the number of ogt applications.
	 *
	 * @return the number of ogt applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OGTAPPLICATION);

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
		return "ogtApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt application persistence.
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

		_finderPathWithPaginationFindBygetOgtByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOgtByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetOgtByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOgtByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetOgtByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetOgtByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOgtByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetOgtByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOgtByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetOgtByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetOgtByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetOgtByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetOgtByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOgtByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetOgtByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOgtByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetOgtByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOgtByEntityId",
			new String[] {String.class.getName()}, new String[] {"entityId"},
			true);

		_finderPathCountBygetOgtByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgtByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetOgtByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetOgtByEntityId_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetOgtByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOgtByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetOgtByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgtByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetOgtByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetOgtByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetOgtByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetOgtByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOgtByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, false);

		OgtApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtApplicationUtil.setPersistence(null);

		entityCache.removeCache(OgtApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTAPPLICATION =
		"SELECT ogtApplication FROM OgtApplication ogtApplication";

	private static final String _SQL_SELECT_OGTAPPLICATION_WHERE =
		"SELECT ogtApplication FROM OgtApplication ogtApplication WHERE ";

	private static final String _SQL_COUNT_OGTAPPLICATION =
		"SELECT COUNT(ogtApplication) FROM OgtApplication ogtApplication";

	private static final String _SQL_COUNT_OGTAPPLICATION_WHERE =
		"SELECT COUNT(ogtApplication) FROM OgtApplication ogtApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}