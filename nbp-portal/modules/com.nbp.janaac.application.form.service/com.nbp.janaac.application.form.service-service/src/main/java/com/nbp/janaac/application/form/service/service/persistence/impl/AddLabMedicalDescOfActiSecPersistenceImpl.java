/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalDescOfActiSecException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalDescOfActiSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalDescOfActiSecUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add lab medical desc of acti sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabMedicalDescOfActiSecPersistence.class)
public class AddLabMedicalDescOfActiSecPersistenceImpl
	extends BasePersistenceImpl<AddLabMedicalDescOfActiSec>
	implements AddLabMedicalDescOfActiSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabMedicalDescOfActiSecUtil</code> to access the add lab medical desc of acti sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabMedicalDescOfActiSecImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of matching add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabMedicalDescOfActiSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalDescOfActiSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec :
						list) {

					if (janaacApplicationId !=
							addLabMedicalDescOfActiSec.
								getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABMEDICALDESCOFACTISEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabMedicalDescOfActiSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabMedicalDescOfActiSec>)QueryUtil.list(
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
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabMedicalDescOfActiSec != null) {
			return addLabMedicalDescOfActiSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalDescOfActiSecException(sb.toString());
	}

	/**
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		List<AddLabMedicalDescOfActiSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabMedicalDescOfActiSec != null) {
			return addLabMedicalDescOfActiSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalDescOfActiSecException(sb.toString());
	}

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabMedicalDescOfActiSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab medical desc of acti secs before and after the current add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the current add lab medical desc of acti sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalDescOfActiSecId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
			findByPrimaryKey(addLabMedicalDescOfActiSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalDescOfActiSec[] array =
				new AddLabMedicalDescOfActiSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalDescOfActiSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabMedicalDescOfActiSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalDescOfActiSec, janaacApplicationId,
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

	protected AddLabMedicalDescOfActiSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec,
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABMEDICALDESCOFACTISEC_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabMedicalDescOfActiSecModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLabMedicalDescOfActiSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabMedicalDescOfActiSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab medical desc of acti secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabMedicalDescOfActiSec);
		}
	}

	/**
	 * Returns the number of add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical desc of acti secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABMEDICALDESCOFACTISEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabMedicalDescOfActiSec.janaacApplicationId = ?";

	public AddLabMedicalDescOfActiSecPersistenceImpl() {
		setModelClass(AddLabMedicalDescOfActiSec.class);

		setModelImplClass(AddLabMedicalDescOfActiSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabMedicalDescOfActiSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab medical desc of acti sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 */
	@Override
	public void cacheResult(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		entityCache.putResult(
			AddLabMedicalDescOfActiSecImpl.class,
			addLabMedicalDescOfActiSec.getPrimaryKey(),
			addLabMedicalDescOfActiSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab medical desc of acti secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSecs the add lab medical desc of acti secs
	 */
	@Override
	public void cacheResult(
		List<AddLabMedicalDescOfActiSec> addLabMedicalDescOfActiSecs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabMedicalDescOfActiSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec :
				addLabMedicalDescOfActiSecs) {

			if (entityCache.getResult(
					AddLabMedicalDescOfActiSecImpl.class,
					addLabMedicalDescOfActiSec.getPrimaryKey()) == null) {

				cacheResult(addLabMedicalDescOfActiSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab medical desc of acti secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabMedicalDescOfActiSecImpl.class);

		finderCache.clearCache(AddLabMedicalDescOfActiSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab medical desc of acti sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		entityCache.removeResult(
			AddLabMedicalDescOfActiSecImpl.class, addLabMedicalDescOfActiSec);
	}

	@Override
	public void clearCache(
		List<AddLabMedicalDescOfActiSec> addLabMedicalDescOfActiSecs) {

		for (AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec :
				addLabMedicalDescOfActiSecs) {

			entityCache.removeResult(
				AddLabMedicalDescOfActiSecImpl.class,
				addLabMedicalDescOfActiSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabMedicalDescOfActiSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabMedicalDescOfActiSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab medical desc of acti sec with the primary key. Does not add the add lab medical desc of acti sec to the database.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key for the new add lab medical desc of acti sec
	 * @return the new add lab medical desc of acti sec
	 */
	@Override
	public AddLabMedicalDescOfActiSec create(
		long addLabMedicalDescOfActiSecId) {

		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
			new AddLabMedicalDescOfActiSecImpl();

		addLabMedicalDescOfActiSec.setNew(true);
		addLabMedicalDescOfActiSec.setPrimaryKey(addLabMedicalDescOfActiSecId);

		addLabMedicalDescOfActiSec.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabMedicalDescOfActiSec;
	}

	/**
	 * Removes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec remove(long addLabMedicalDescOfActiSecId)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		return remove((Serializable)addLabMedicalDescOfActiSecId);
	}

	/**
	 * Removes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec remove(Serializable primaryKey)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
				(AddLabMedicalDescOfActiSec)session.get(
					AddLabMedicalDescOfActiSecImpl.class, primaryKey);

			if (addLabMedicalDescOfActiSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabMedicalDescOfActiSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabMedicalDescOfActiSec);
		}
		catch (NoSuchAddLabMedicalDescOfActiSecException
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
	protected AddLabMedicalDescOfActiSec removeImpl(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabMedicalDescOfActiSec)) {
				addLabMedicalDescOfActiSec =
					(AddLabMedicalDescOfActiSec)session.get(
						AddLabMedicalDescOfActiSecImpl.class,
						addLabMedicalDescOfActiSec.getPrimaryKeyObj());
			}

			if (addLabMedicalDescOfActiSec != null) {
				session.delete(addLabMedicalDescOfActiSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabMedicalDescOfActiSec != null) {
			clearCache(addLabMedicalDescOfActiSec);
		}

		return addLabMedicalDescOfActiSec;
	}

	@Override
	public AddLabMedicalDescOfActiSec updateImpl(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		boolean isNew = addLabMedicalDescOfActiSec.isNew();

		if (!(addLabMedicalDescOfActiSec instanceof
				AddLabMedicalDescOfActiSecModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabMedicalDescOfActiSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabMedicalDescOfActiSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabMedicalDescOfActiSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabMedicalDescOfActiSec implementation " +
					addLabMedicalDescOfActiSec.getClass());
		}

		AddLabMedicalDescOfActiSecModelImpl
			addLabMedicalDescOfActiSecModelImpl =
				(AddLabMedicalDescOfActiSecModelImpl)addLabMedicalDescOfActiSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabMedicalDescOfActiSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabMedicalDescOfActiSec.setCreateDate(date);
			}
			else {
				addLabMedicalDescOfActiSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabMedicalDescOfActiSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabMedicalDescOfActiSec.setModifiedDate(date);
			}
			else {
				addLabMedicalDescOfActiSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabMedicalDescOfActiSec);
			}
			else {
				addLabMedicalDescOfActiSec =
					(AddLabMedicalDescOfActiSec)session.merge(
						addLabMedicalDescOfActiSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabMedicalDescOfActiSecImpl.class,
			addLabMedicalDescOfActiSecModelImpl, false, true);

		if (isNew) {
			addLabMedicalDescOfActiSec.setNew(false);
		}

		addLabMedicalDescOfActiSec.resetOriginalValues();

		return addLabMedicalDescOfActiSec;
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec =
			fetchByPrimaryKey(primaryKey);

		if (addLabMedicalDescOfActiSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabMedicalDescOfActiSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabMedicalDescOfActiSec;
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or throws a <code>NoSuchAddLabMedicalDescOfActiSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec findByPrimaryKey(
			long addLabMedicalDescOfActiSecId)
		throws NoSuchAddLabMedicalDescOfActiSecException {

		return findByPrimaryKey((Serializable)addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec, or <code>null</code> if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public AddLabMedicalDescOfActiSec fetchByPrimaryKey(
		long addLabMedicalDescOfActiSecId) {

		return fetchByPrimaryKey((Serializable)addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns all the add lab medical desc of acti secs.
	 *
	 * @return the add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	@Override
	public List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator,
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

		List<AddLabMedicalDescOfActiSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalDescOfActiSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABMEDICALDESCOFACTISEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABMEDICALDESCOFACTISEC;

				sql = sql.concat(
					AddLabMedicalDescOfActiSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabMedicalDescOfActiSec>)QueryUtil.list(
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
	 * Removes all the add lab medical desc of acti secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec :
				findAll()) {

			remove(addLabMedicalDescOfActiSec);
		}
	}

	/**
	 * Returns the number of add lab medical desc of acti secs.
	 *
	 * @return the number of add lab medical desc of acti secs
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
					_SQL_COUNT_ADDLABMEDICALDESCOFACTISEC);

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
		return "addLabMedicalDescOfActiSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABMEDICALDESCOFACTISEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabMedicalDescOfActiSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab medical desc of acti sec persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabMedicalDescOfActiSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabMedicalDescOfActiSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabMedicalDescOfActiSecImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDLABMEDICALDESCOFACTISEC =
		"SELECT addLabMedicalDescOfActiSec FROM AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec";

	private static final String _SQL_SELECT_ADDLABMEDICALDESCOFACTISEC_WHERE =
		"SELECT addLabMedicalDescOfActiSec FROM AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec WHERE ";

	private static final String _SQL_COUNT_ADDLABMEDICALDESCOFACTISEC =
		"SELECT COUNT(addLabMedicalDescOfActiSec) FROM AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec";

	private static final String _SQL_COUNT_ADDLABMEDICALDESCOFACTISEC_WHERE =
		"SELECT COUNT(addLabMedicalDescOfActiSec) FROM AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabMedicalDescOfActiSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabMedicalDescOfActiSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabMedicalDescOfActiSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabMedicalDescOfActiSecPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}