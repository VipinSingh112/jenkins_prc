/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManufacturingApplicationException;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplicationTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManufacturingApplicationModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

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
 * The persistence implementation for the manufacturing application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManufacturingApplicationPersistence.class)
public class ManufacturingApplicationPersistenceImpl
	extends BasePersistenceImpl<ManufacturingApplication>
	implements ManufacturingApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManufacturingApplicationUtil</code> to access the manufacturing application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManufacturingApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetManuafactureByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetManuafactureByS_U;
	private FinderPath _finderPathCountBygetManuafactureByS_U;

	/**
	 * Returns all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status) {

		return findBygetManuafactureByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end) {

		return findBygetManuafactureByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return findBygetManuafactureByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetManuafactureByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetManuafactureByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<ManufacturingApplication> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManufacturingApplication manufacturingApplication : list) {
					if ((userId != manufacturingApplication.getUserId()) ||
						(status != manufacturingApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManufacturingApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<ManufacturingApplication>)QueryUtil.list(
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
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManuafactureByS_U_First(
			long userId, int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManuafactureByS_U_First(
				userId, status, orderByComparator);

		if (manufacturingApplication != null) {
			return manufacturingApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManufacturingApplicationException(sb.toString());
	}

	/**
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManuafactureByS_U_First(
		long userId, int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		List<ManufacturingApplication> list = findBygetManuafactureByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManuafactureByS_U_Last(
			long userId, int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManuafactureByS_U_Last(userId, status, orderByComparator);

		if (manufacturingApplication != null) {
			return manufacturingApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManufacturingApplicationException(sb.toString());
	}

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManuafactureByS_U_Last(
		long userId, int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		int count = countBygetManuafactureByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<ManufacturingApplication> list = findBygetManuafactureByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication[] findBygetManuafactureByS_U_PrevAndNext(
			long manufacturingApplicationId, long userId, int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication = findByPrimaryKey(
			manufacturingApplicationId);

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplication[] array =
				new ManufacturingApplicationImpl[3];

			array[0] = getBygetManuafactureByS_U_PrevAndNext(
				session, manufacturingApplication, userId, status,
				orderByComparator, true);

			array[1] = manufacturingApplication;

			array[2] = getBygetManuafactureByS_U_PrevAndNext(
				session, manufacturingApplication, userId, status,
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

	protected ManufacturingApplication getBygetManuafactureByS_U_PrevAndNext(
		Session session, ManufacturingApplication manufacturingApplication,
		long userId, int status,
		OrderByComparator<ManufacturingApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_STATUS_2);

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
			sb.append(ManufacturingApplicationModelImpl.ORDER_BY_JPQL);
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
						manufacturingApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManufacturingApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manufacturing applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetManuafactureByS_U(long userId, int status) {
		for (ManufacturingApplication manufacturingApplication :
				findBygetManuafactureByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(manufacturingApplication);
		}
	}

	/**
	 * Returns the number of manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	@Override
	public int countBygetManuafactureByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetManuafactureByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETMANUAFACTUREBYS_U_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETMANUAFACTUREBYS_U_USERID_2 =
		"manufacturingApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETMANUAFACTUREBYS_U_STATUS_2 =
		"manufacturingApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetManufacturingByStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetManufacturingByStatus;
	private FinderPath _finderPathCountBygetManufacturingByStatus;

	/**
	 * Returns all the manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status) {

		return findBygetManufacturingByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end) {

		return findBygetManufacturingByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return findBygetManufacturingByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetManufacturingByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetManufacturingByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<ManufacturingApplication> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManufacturingApplication manufacturingApplication : list) {
					if (status != manufacturingApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManufacturingApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<ManufacturingApplication>)QueryUtil.list(
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
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManufacturingByStatus_First(
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManufacturingByStatus_First(status, orderByComparator);

		if (manufacturingApplication != null) {
			return manufacturingApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManufacturingApplicationException(sb.toString());
	}

	/**
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByStatus_First(
		int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		List<ManufacturingApplication> list = findBygetManufacturingByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManufacturingByStatus_Last(
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManufacturingByStatus_Last(status, orderByComparator);

		if (manufacturingApplication != null) {
			return manufacturingApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchManufacturingApplicationException(sb.toString());
	}

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByStatus_Last(
		int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		int count = countBygetManufacturingByStatus(status);

		if (count == 0) {
			return null;
		}

		List<ManufacturingApplication> list = findBygetManufacturingByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication[]
			findBygetManufacturingByStatus_PrevAndNext(
				long manufacturingApplicationId, int status,
				OrderByComparator<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication = findByPrimaryKey(
			manufacturingApplicationId);

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplication[] array =
				new ManufacturingApplicationImpl[3];

			array[0] = getBygetManufacturingByStatus_PrevAndNext(
				session, manufacturingApplication, status, orderByComparator,
				true);

			array[1] = manufacturingApplication;

			array[2] = getBygetManufacturingByStatus_PrevAndNext(
				session, manufacturingApplication, status, orderByComparator,
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

	protected ManufacturingApplication
		getBygetManufacturingByStatus_PrevAndNext(
			Session session, ManufacturingApplication manufacturingApplication,
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYSTATUS_STATUS_2);

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
			sb.append(ManufacturingApplicationModelImpl.ORDER_BY_JPQL);
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
						manufacturingApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManufacturingApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manufacturing applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetManufacturingByStatus(int status) {
		for (ManufacturingApplication manufacturingApplication :
				findBygetManufacturingByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(manufacturingApplication);
		}
	}

	/**
	 * Returns the number of manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	@Override
	public int countBygetManufacturingByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetManufacturingByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYSTATUS_STATUS_2);

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

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYSTATUS_STATUS_2 =
			"manufacturingApplication.status = ?";

	private FinderPath _finderPathFetchBygetManufacturingByAppNum;
	private FinderPath _finderPathCountBygetManufacturingByAppNum;

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManufacturingByAppNum(
			String applicationNumber)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManufacturingByAppNum(applicationNumber);

		if (manufacturingApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingApplicationException(sb.toString());
		}

		return manufacturingApplication;
	}

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber) {

		return fetchBygetManufacturingByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingByAppNum, finderArgs, this);
		}

		if (result instanceof ManufacturingApplication) {
			ManufacturingApplication manufacturingApplication =
				(ManufacturingApplication)result;

			if (!Objects.equals(
					applicationNumber,
					manufacturingApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_2);
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

				List<ManufacturingApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingByAppNum,
							finderArgs, list);
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
								"ManufacturingApplicationPersistenceImpl.fetchBygetManufacturingByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplication manufacturingApplication =
						list.get(0);

					result = manufacturingApplication;

					cacheResult(manufacturingApplication);
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
			return (ManufacturingApplication)result;
		}
	}

	/**
	 * Removes the manufacturing application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the manufacturing application that was removed
	 */
	@Override
	public ManufacturingApplication removeBygetManufacturingByAppNum(
			String applicationNumber)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			findBygetManufacturingByAppNum(applicationNumber);

		return remove(manufacturingApplication);
	}

	/**
	 * Returns the number of manufacturing applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching manufacturing applications
	 */
	@Override
	public int countBygetManufacturingByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetManufacturingByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_2 =
			"manufacturingApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYAPPNUM_APPLICATIONNUMBER_3 =
			"(manufacturingApplication.applicationNumber IS NULL OR manufacturingApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetManufacturingByRT_AppNo;
	private FinderPath _finderPathCountBygetManufacturingByRT_AppNo;

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManufacturingByRT_AppNo(
				licenseRequest, expiredLicenseAppNumber);

		if (manufacturingApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("licenseRequest=");
			sb.append(licenseRequest);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingApplicationException(sb.toString());
		}

		return manufacturingApplication;
	}

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber) {

		return fetchBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		licenseRequest = Objects.toString(licenseRequest, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {licenseRequest, expiredLicenseAppNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingByRT_AppNo, finderArgs, this);
		}

		if (result instanceof ManufacturingApplication) {
			ManufacturingApplication manufacturingApplication =
				(ManufacturingApplication)result;

			if (!Objects.equals(
					licenseRequest,
					manufacturingApplication.getLicenseRequest()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					manufacturingApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindLicenseRequest = false;

			if (licenseRequest.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_3);
			}
			else {
				bindLicenseRequest = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseRequest) {
					queryPos.add(licenseRequest);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<ManufacturingApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingByRT_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									licenseRequest, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"ManufacturingApplicationPersistenceImpl.fetchBygetManufacturingByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplication manufacturingApplication =
						list.get(0);

					result = manufacturingApplication;

					cacheResult(manufacturingApplication);
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
			return (ManufacturingApplication)result;
		}
	}

	/**
	 * Removes the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the manufacturing application that was removed
	 */
	@Override
	public ManufacturingApplication removeBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			findBygetManufacturingByRT_AppNo(
				licenseRequest, expiredLicenseAppNumber);

		return remove(manufacturingApplication);
	}

	/**
	 * Returns the number of manufacturing applications where licenseRequest = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching manufacturing applications
	 */
	@Override
	public int countBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber) {

		licenseRequest = Objects.toString(licenseRequest, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetManufacturingByRT_AppNo;

		Object[] finderArgs = new Object[] {
			licenseRequest, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindLicenseRequest = false;

			if (licenseRequest.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_3);
			}
			else {
				bindLicenseRequest = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseRequest) {
					queryPos.add(licenseRequest);
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
		_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_2 =
			"manufacturingApplication.licenseRequest = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_LICENSEREQUEST_3 =
			"(manufacturingApplication.licenseRequest IS NULL OR manufacturingApplication.licenseRequest = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"manufacturingApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(manufacturingApplication.expiredLicenseAppNumber IS NULL OR manufacturingApplication.expiredLicenseAppNumber = '')";

	private FinderPath _finderPathFetchBygetManufacturingByCaseId;
	private FinderPath _finderPathCountBygetManufacturingByCaseId;

	/**
	 * Returns the manufacturing application where caseId = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication findBygetManufacturingByCaseId(
			String caseId)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			fetchBygetManufacturingByCaseId(caseId);

		if (manufacturingApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingApplicationException(sb.toString());
		}

		return manufacturingApplication;
	}

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId) {

		return fetchBygetManufacturingByCaseId(caseId, true);
	}

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	@Override
	public ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingByCaseId, finderArgs, this);
		}

		if (result instanceof ManufacturingApplication) {
			ManufacturingApplication manufacturingApplication =
				(ManufacturingApplication)result;

			if (!Objects.equals(caseId, manufacturingApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_2);
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

				List<ManufacturingApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingByCaseId,
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
								"ManufacturingApplicationPersistenceImpl.fetchBygetManufacturingByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplication manufacturingApplication =
						list.get(0);

					result = manufacturingApplication;

					cacheResult(manufacturingApplication);
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
			return (ManufacturingApplication)result;
		}
	}

	/**
	 * Removes the manufacturing application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing application that was removed
	 */
	@Override
	public ManufacturingApplication removeBygetManufacturingByCaseId(
			String caseId)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication =
			findBygetManufacturingByCaseId(caseId);

		return remove(manufacturingApplication);
	}

	/**
	 * Returns the number of manufacturing applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing applications
	 */
	@Override
	public int countBygetManufacturingByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetManufacturingByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_2);
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
		_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_2 =
			"manufacturingApplication.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGBYCASEID_CASEID_3 =
			"(manufacturingApplication.caseId IS NULL OR manufacturingApplication.caseId = '')";

	public ManufacturingApplicationPersistenceImpl() {
		setModelClass(ManufacturingApplication.class);

		setModelImplClass(ManufacturingApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(ManufacturingApplicationTable.INSTANCE);
	}

	/**
	 * Caches the manufacturing application in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplication the manufacturing application
	 */
	@Override
	public void cacheResult(ManufacturingApplication manufacturingApplication) {
		entityCache.putResult(
			ManufacturingApplicationImpl.class,
			manufacturingApplication.getPrimaryKey(), manufacturingApplication);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingByAppNum,
			new Object[] {manufacturingApplication.getApplicationNumber()},
			manufacturingApplication);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingByRT_AppNo,
			new Object[] {
				manufacturingApplication.getLicenseRequest(),
				manufacturingApplication.getExpiredLicenseAppNumber()
			},
			manufacturingApplication);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingByCaseId,
			new Object[] {manufacturingApplication.getCaseId()},
			manufacturingApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manufacturing applications in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplications the manufacturing applications
	 */
	@Override
	public void cacheResult(
		List<ManufacturingApplication> manufacturingApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manufacturingApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManufacturingApplication manufacturingApplication :
				manufacturingApplications) {

			if (entityCache.getResult(
					ManufacturingApplicationImpl.class,
					manufacturingApplication.getPrimaryKey()) == null) {

				cacheResult(manufacturingApplication);
			}
		}
	}

	/**
	 * Clears the cache for all manufacturing applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManufacturingApplicationImpl.class);

		finderCache.clearCache(ManufacturingApplicationImpl.class);
	}

	/**
	 * Clears the cache for the manufacturing application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManufacturingApplication manufacturingApplication) {
		entityCache.removeResult(
			ManufacturingApplicationImpl.class, manufacturingApplication);
	}

	@Override
	public void clearCache(
		List<ManufacturingApplication> manufacturingApplications) {

		for (ManufacturingApplication manufacturingApplication :
				manufacturingApplications) {

			entityCache.removeResult(
				ManufacturingApplicationImpl.class, manufacturingApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManufacturingApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManufacturingApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManufacturingApplicationModelImpl manufacturingApplicationModelImpl) {

		Object[] args = new Object[] {
			manufacturingApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetManufacturingByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingByAppNum, args,
			manufacturingApplicationModelImpl);

		args = new Object[] {
			manufacturingApplicationModelImpl.getLicenseRequest(),
			manufacturingApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetManufacturingByRT_AppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingByRT_AppNo, args,
			manufacturingApplicationModelImpl);

		args = new Object[] {manufacturingApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetManufacturingByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingByCaseId, args,
			manufacturingApplicationModelImpl);
	}

	/**
	 * Creates a new manufacturing application with the primary key. Does not add the manufacturing application to the database.
	 *
	 * @param manufacturingApplicationId the primary key for the new manufacturing application
	 * @return the new manufacturing application
	 */
	@Override
	public ManufacturingApplication create(long manufacturingApplicationId) {
		ManufacturingApplication manufacturingApplication =
			new ManufacturingApplicationImpl();

		manufacturingApplication.setNew(true);
		manufacturingApplication.setPrimaryKey(manufacturingApplicationId);

		manufacturingApplication.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manufacturingApplication;
	}

	/**
	 * Removes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication remove(long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationException {

		return remove((Serializable)manufacturingApplicationId);
	}

	/**
	 * Removes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication remove(Serializable primaryKey)
		throws NoSuchManufacturingApplicationException {

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplication manufacturingApplication =
				(ManufacturingApplication)session.get(
					ManufacturingApplicationImpl.class, primaryKey);

			if (manufacturingApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManufacturingApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manufacturingApplication);
		}
		catch (NoSuchManufacturingApplicationException noSuchEntityException) {
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
	protected ManufacturingApplication removeImpl(
		ManufacturingApplication manufacturingApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manufacturingApplication)) {
				manufacturingApplication =
					(ManufacturingApplication)session.get(
						ManufacturingApplicationImpl.class,
						manufacturingApplication.getPrimaryKeyObj());
			}

			if (manufacturingApplication != null) {
				session.delete(manufacturingApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manufacturingApplication != null) {
			clearCache(manufacturingApplication);
		}

		return manufacturingApplication;
	}

	@Override
	public ManufacturingApplication updateImpl(
		ManufacturingApplication manufacturingApplication) {

		boolean isNew = manufacturingApplication.isNew();

		if (!(manufacturingApplication instanceof
				ManufacturingApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manufacturingApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manufacturingApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manufacturingApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManufacturingApplication implementation " +
					manufacturingApplication.getClass());
		}

		ManufacturingApplicationModelImpl manufacturingApplicationModelImpl =
			(ManufacturingApplicationModelImpl)manufacturingApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manufacturingApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				manufacturingApplication.setCreateDate(date);
			}
			else {
				manufacturingApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manufacturingApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manufacturingApplication.setModifiedDate(date);
			}
			else {
				manufacturingApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manufacturingApplication);
			}
			else {
				manufacturingApplication =
					(ManufacturingApplication)session.merge(
						manufacturingApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManufacturingApplicationImpl.class,
			manufacturingApplicationModelImpl, false, true);

		cacheUniqueFindersCache(manufacturingApplicationModelImpl);

		if (isNew) {
			manufacturingApplication.setNew(false);
		}

		manufacturingApplication.resetOriginalValues();

		return manufacturingApplication;
	}

	/**
	 * Returns the manufacturing application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManufacturingApplicationException {

		ManufacturingApplication manufacturingApplication = fetchByPrimaryKey(
			primaryKey);

		if (manufacturingApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManufacturingApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manufacturingApplication;
	}

	/**
	 * Returns the manufacturing application with the primary key or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication findByPrimaryKey(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationException {

		return findByPrimaryKey((Serializable)manufacturingApplicationId);
	}

	/**
	 * Returns the manufacturing application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application, or <code>null</code> if a manufacturing application with the primary key could not be found
	 */
	@Override
	public ManufacturingApplication fetchByPrimaryKey(
		long manufacturingApplicationId) {

		return fetchByPrimaryKey((Serializable)manufacturingApplicationId);
	}

	/**
	 * Returns all the manufacturing applications.
	 *
	 * @return the manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing applications
	 */
	@Override
	public List<ManufacturingApplication> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
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

		List<ManufacturingApplication> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUFACTURINGAPPLICATION;

				sql = sql.concat(
					ManufacturingApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManufacturingApplication>)QueryUtil.list(
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
	 * Removes all the manufacturing applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManufacturingApplication manufacturingApplication : findAll()) {
			remove(manufacturingApplication);
		}
	}

	/**
	 * Returns the number of manufacturing applications.
	 *
	 * @return the number of manufacturing applications
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
					_SQL_COUNT_MANUFACTURINGAPPLICATION);

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
		return "manufacturingApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUFACTURINGAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManufacturingApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manufacturing application persistence.
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

		_finderPathWithPaginationFindBygetManuafactureByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetManuafactureByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetManuafactureByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetManuafactureByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetManuafactureByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManuafactureByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetManufacturingByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetManufacturingByStatus",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetManufacturingByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetManufacturingByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetManufacturingByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetManufacturingByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufacturingByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetManufacturingByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetManufacturingByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufacturingByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"licenseRequest", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetManufacturingByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"licenseRequest", "expiredLicenseAppNumber"}, false);

		_finderPathFetchBygetManufacturingByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufacturingByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetManufacturingByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		ManufacturingApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManufacturingApplicationUtil.setPersistence(null);

		entityCache.removeCache(ManufacturingApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUFACTURINGAPPLICATION =
		"SELECT manufacturingApplication FROM ManufacturingApplication manufacturingApplication";

	private static final String _SQL_SELECT_MANUFACTURINGAPPLICATION_WHERE =
		"SELECT manufacturingApplication FROM ManufacturingApplication manufacturingApplication WHERE ";

	private static final String _SQL_COUNT_MANUFACTURINGAPPLICATION =
		"SELECT COUNT(manufacturingApplication) FROM ManufacturingApplication manufacturingApplication";

	private static final String _SQL_COUNT_MANUFACTURINGAPPLICATION_WHERE =
		"SELECT COUNT(manufacturingApplication) FROM ManufacturingApplication manufacturingApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manufacturingApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManufacturingApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManufacturingApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManufacturingApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}