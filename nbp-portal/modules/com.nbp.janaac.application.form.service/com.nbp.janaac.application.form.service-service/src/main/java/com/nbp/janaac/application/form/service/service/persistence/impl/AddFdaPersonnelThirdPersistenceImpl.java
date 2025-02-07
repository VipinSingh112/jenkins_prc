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

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelThirdException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaPersonnelThirdUtil;
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
 * The persistence implementation for the add fda personnel third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaPersonnelThirdPersistence.class)
public class AddFdaPersonnelThirdPersistenceImpl
	extends BasePersistenceImpl<AddFdaPersonnelThird>
	implements AddFdaPersonnelThirdPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaPersonnelThirdUtil</code> to access the add fda personnel third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaPersonnelThirdImpl.class.getName();

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
	 * Returns all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of matching add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator,
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

		List<AddFdaPersonnelThird> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelThird>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaPersonnelThird addFdaPersonnelThird : list) {
					if (janaacApplicationId !=
							addFdaPersonnelThird.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDFDAPERSONNELTHIRD_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaPersonnelThirdModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaPersonnelThird>)QueryUtil.list(
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
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	@Override
	public AddFdaPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException {

		AddFdaPersonnelThird addFdaPersonnelThird = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelThird != null) {
			return addFdaPersonnelThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelThirdException(sb.toString());
	}

	/**
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	@Override
	public AddFdaPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		List<AddFdaPersonnelThird> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	@Override
	public AddFdaPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException {

		AddFdaPersonnelThird addFdaPersonnelThird = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaPersonnelThird != null) {
			return addFdaPersonnelThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaPersonnelThirdException(sb.toString());
	}

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	@Override
	public AddFdaPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaPersonnelThird> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda personnel thirds before and after the current add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the current add fda personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelThirdId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws NoSuchAddFdaPersonnelThirdException {

		AddFdaPersonnelThird addFdaPersonnelThird = findByPrimaryKey(
			addFdaPersonnelThirdId);

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelThird[] array = new AddFdaPersonnelThirdImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelThird, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaPersonnelThird;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaPersonnelThird, janaacApplicationId,
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

	protected AddFdaPersonnelThird getBygetJanaacById_PrevAndNext(
		Session session, AddFdaPersonnelThird addFdaPersonnelThird,
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDFDAPERSONNELTHIRD_WHERE);

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
			sb.append(AddFdaPersonnelThirdModelImpl.ORDER_BY_JPQL);
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
						addFdaPersonnelThird)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaPersonnelThird> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaPersonnelThird addFdaPersonnelThird :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaPersonnelThird);
		}
	}

	/**
	 * Returns the number of add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel thirds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDAPERSONNELTHIRD_WHERE);

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
			"addFdaPersonnelThird.janaacApplicationId = ?";

	public AddFdaPersonnelThirdPersistenceImpl() {
		setModelClass(AddFdaPersonnelThird.class);

		setModelImplClass(AddFdaPersonnelThirdImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaPersonnelThirdTable.INSTANCE);
	}

	/**
	 * Caches the add fda personnel third in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 */
	@Override
	public void cacheResult(AddFdaPersonnelThird addFdaPersonnelThird) {
		entityCache.putResult(
			AddFdaPersonnelThirdImpl.class,
			addFdaPersonnelThird.getPrimaryKey(), addFdaPersonnelThird);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThirds the add fda personnel thirds
	 */
	@Override
	public void cacheResult(List<AddFdaPersonnelThird> addFdaPersonnelThirds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaPersonnelThirds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaPersonnelThird addFdaPersonnelThird :
				addFdaPersonnelThirds) {

			if (entityCache.getResult(
					AddFdaPersonnelThirdImpl.class,
					addFdaPersonnelThird.getPrimaryKey()) == null) {

				cacheResult(addFdaPersonnelThird);
			}
		}
	}

	/**
	 * Clears the cache for all add fda personnel thirds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaPersonnelThirdImpl.class);

		finderCache.clearCache(AddFdaPersonnelThirdImpl.class);
	}

	/**
	 * Clears the cache for the add fda personnel third.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaPersonnelThird addFdaPersonnelThird) {
		entityCache.removeResult(
			AddFdaPersonnelThirdImpl.class, addFdaPersonnelThird);
	}

	@Override
	public void clearCache(List<AddFdaPersonnelThird> addFdaPersonnelThirds) {
		for (AddFdaPersonnelThird addFdaPersonnelThird :
				addFdaPersonnelThirds) {

			entityCache.removeResult(
				AddFdaPersonnelThirdImpl.class, addFdaPersonnelThird);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaPersonnelThirdImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddFdaPersonnelThirdImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda personnel third with the primary key. Does not add the add fda personnel third to the database.
	 *
	 * @param addFdaPersonnelThirdId the primary key for the new add fda personnel third
	 * @return the new add fda personnel third
	 */
	@Override
	public AddFdaPersonnelThird create(long addFdaPersonnelThirdId) {
		AddFdaPersonnelThird addFdaPersonnelThird =
			new AddFdaPersonnelThirdImpl();

		addFdaPersonnelThird.setNew(true);
		addFdaPersonnelThird.setPrimaryKey(addFdaPersonnelThirdId);

		addFdaPersonnelThird.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaPersonnelThird;
	}

	/**
	 * Removes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird remove(long addFdaPersonnelThirdId)
		throws NoSuchAddFdaPersonnelThirdException {

		return remove((Serializable)addFdaPersonnelThirdId);
	}

	/**
	 * Removes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird remove(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelThirdException {

		Session session = null;

		try {
			session = openSession();

			AddFdaPersonnelThird addFdaPersonnelThird =
				(AddFdaPersonnelThird)session.get(
					AddFdaPersonnelThirdImpl.class, primaryKey);

			if (addFdaPersonnelThird == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaPersonnelThirdException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaPersonnelThird);
		}
		catch (NoSuchAddFdaPersonnelThirdException noSuchEntityException) {
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
	protected AddFdaPersonnelThird removeImpl(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaPersonnelThird)) {
				addFdaPersonnelThird = (AddFdaPersonnelThird)session.get(
					AddFdaPersonnelThirdImpl.class,
					addFdaPersonnelThird.getPrimaryKeyObj());
			}

			if (addFdaPersonnelThird != null) {
				session.delete(addFdaPersonnelThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaPersonnelThird != null) {
			clearCache(addFdaPersonnelThird);
		}

		return addFdaPersonnelThird;
	}

	@Override
	public AddFdaPersonnelThird updateImpl(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		boolean isNew = addFdaPersonnelThird.isNew();

		if (!(addFdaPersonnelThird instanceof AddFdaPersonnelThirdModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaPersonnelThird.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaPersonnelThird);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaPersonnelThird proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaPersonnelThird implementation " +
					addFdaPersonnelThird.getClass());
		}

		AddFdaPersonnelThirdModelImpl addFdaPersonnelThirdModelImpl =
			(AddFdaPersonnelThirdModelImpl)addFdaPersonnelThird;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaPersonnelThird.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaPersonnelThird.setCreateDate(date);
			}
			else {
				addFdaPersonnelThird.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaPersonnelThirdModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaPersonnelThird.setModifiedDate(date);
			}
			else {
				addFdaPersonnelThird.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaPersonnelThird);
			}
			else {
				addFdaPersonnelThird = (AddFdaPersonnelThird)session.merge(
					addFdaPersonnelThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaPersonnelThirdImpl.class, addFdaPersonnelThirdModelImpl,
			false, true);

		if (isNew) {
			addFdaPersonnelThird.setNew(false);
		}

		addFdaPersonnelThird.resetOriginalValues();

		return addFdaPersonnelThird;
	}

	/**
	 * Returns the add fda personnel third with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaPersonnelThirdException {

		AddFdaPersonnelThird addFdaPersonnelThird = fetchByPrimaryKey(
			primaryKey);

		if (addFdaPersonnelThird == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaPersonnelThirdException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaPersonnelThird;
	}

	/**
	 * Returns the add fda personnel third with the primary key or throws a <code>NoSuchAddFdaPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird findByPrimaryKey(long addFdaPersonnelThirdId)
		throws NoSuchAddFdaPersonnelThirdException {

		return findByPrimaryKey((Serializable)addFdaPersonnelThirdId);
	}

	/**
	 * Returns the add fda personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third, or <code>null</code> if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public AddFdaPersonnelThird fetchByPrimaryKey(long addFdaPersonnelThirdId) {
		return fetchByPrimaryKey((Serializable)addFdaPersonnelThirdId);
	}

	/**
	 * Returns all the add fda personnel thirds.
	 *
	 * @return the add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel thirds
	 */
	@Override
	public List<AddFdaPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator,
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

		List<AddFdaPersonnelThird> list = null;

		if (useFinderCache) {
			list = (List<AddFdaPersonnelThird>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDAPERSONNELTHIRD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDAPERSONNELTHIRD;

				sql = sql.concat(AddFdaPersonnelThirdModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaPersonnelThird>)QueryUtil.list(
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
	 * Removes all the add fda personnel thirds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaPersonnelThird addFdaPersonnelThird : findAll()) {
			remove(addFdaPersonnelThird);
		}
	}

	/**
	 * Returns the number of add fda personnel thirds.
	 *
	 * @return the number of add fda personnel thirds
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
					_SQL_COUNT_ADDFDAPERSONNELTHIRD);

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
		return "addFdaPersonnelThirdId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDAPERSONNELTHIRD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaPersonnelThirdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda personnel third persistence.
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

		AddFdaPersonnelThirdUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaPersonnelThirdUtil.setPersistence(null);

		entityCache.removeCache(AddFdaPersonnelThirdImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDFDAPERSONNELTHIRD =
		"SELECT addFdaPersonnelThird FROM AddFdaPersonnelThird addFdaPersonnelThird";

	private static final String _SQL_SELECT_ADDFDAPERSONNELTHIRD_WHERE =
		"SELECT addFdaPersonnelThird FROM AddFdaPersonnelThird addFdaPersonnelThird WHERE ";

	private static final String _SQL_COUNT_ADDFDAPERSONNELTHIRD =
		"SELECT COUNT(addFdaPersonnelThird) FROM AddFdaPersonnelThird addFdaPersonnelThird";

	private static final String _SQL_COUNT_ADDFDAPERSONNELTHIRD_WHERE =
		"SELECT COUNT(addFdaPersonnelThird) FROM AddFdaPersonnelThird addFdaPersonnelThird WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addFdaPersonnelThird.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaPersonnelThird exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaPersonnelThird exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaPersonnelThirdPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}