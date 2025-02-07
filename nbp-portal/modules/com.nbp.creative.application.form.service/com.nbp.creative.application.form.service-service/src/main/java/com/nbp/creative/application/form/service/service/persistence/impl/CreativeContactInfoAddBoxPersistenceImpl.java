/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeContactInfoAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;
import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBoxTable;
import com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeContactInfoAddBoxModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeContactInfoAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeContactInfoAddBoxUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative contact info add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeContactInfoAddBoxPersistence.class)
public class CreativeContactInfoAddBoxPersistenceImpl
	extends BasePersistenceImpl<CreativeContactInfoAddBox>
	implements CreativeContactInfoAddBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeContactInfoAddBoxUtil</code> to access the creative contact info add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeContactInfoAddBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCA_CCB_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_CCB_CAI;
	private FinderPath _finderPathCountBygetCA_CCB_CAI;

	/**
	 * Returns all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId) {

		return findBygetCA_CCB_CAI(
			CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of matching creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end) {

		return findBygetCA_CCB_CAI(CreativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return findBygetCA_CCB_CAI(
			CreativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_CCB_CAI;
				finderArgs = new Object[] {CreativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_CCB_CAI;
			finderArgs = new Object[] {
				CreativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeContactInfoAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeContactInfoAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeContactInfoAddBox creativeContactInfoAddBox :
						list) {

					if (CreativeApplicationId !=
							creativeContactInfoAddBox.
								getCreativeApplicationId()) {

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

			sb.append(_SQL_SELECT_CREATIVECONTACTINFOADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CCB_CAI_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeContactInfoAddBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				list = (List<CreativeContactInfoAddBox>)QueryUtil.list(
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
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	@Override
	public CreativeContactInfoAddBox findBygetCA_CCB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException {

		CreativeContactInfoAddBox creativeContactInfoAddBox =
			fetchBygetCA_CCB_CAI_First(
				CreativeApplicationId, orderByComparator);

		if (creativeContactInfoAddBox != null) {
			return creativeContactInfoAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeContactInfoAddBoxException(sb.toString());
	}

	/**
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	@Override
	public CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		List<CreativeContactInfoAddBox> list = findBygetCA_CCB_CAI(
			CreativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	@Override
	public CreativeContactInfoAddBox findBygetCA_CCB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException {

		CreativeContactInfoAddBox creativeContactInfoAddBox =
			fetchBygetCA_CCB_CAI_Last(CreativeApplicationId, orderByComparator);

		if (creativeContactInfoAddBox != null) {
			return creativeContactInfoAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeContactInfoAddBoxException(sb.toString());
	}

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	@Override
	public CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		int count = countBygetCA_CCB_CAI(CreativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeContactInfoAddBox> list = findBygetCA_CCB_CAI(
			CreativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative contact info add boxes before and after the current creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeContactBoxId the primary key of the current creative contact info add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox[] findBygetCA_CCB_CAI_PrevAndNext(
			long creativeContactBoxId, long CreativeApplicationId,
			OrderByComparator<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException {

		CreativeContactInfoAddBox creativeContactInfoAddBox = findByPrimaryKey(
			creativeContactBoxId);

		Session session = null;

		try {
			session = openSession();

			CreativeContactInfoAddBox[] array =
				new CreativeContactInfoAddBoxImpl[3];

			array[0] = getBygetCA_CCB_CAI_PrevAndNext(
				session, creativeContactInfoAddBox, CreativeApplicationId,
				orderByComparator, true);

			array[1] = creativeContactInfoAddBox;

			array[2] = getBygetCA_CCB_CAI_PrevAndNext(
				session, creativeContactInfoAddBox, CreativeApplicationId,
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

	protected CreativeContactInfoAddBox getBygetCA_CCB_CAI_PrevAndNext(
		Session session, CreativeContactInfoAddBox creativeContactInfoAddBox,
		long CreativeApplicationId,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVECONTACTINFOADDBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_CCB_CAI_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeContactInfoAddBoxModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(CreativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeContactInfoAddBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeContactInfoAddBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative contact info add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetCA_CCB_CAI(long CreativeApplicationId) {
		for (CreativeContactInfoAddBox creativeContactInfoAddBox :
				findBygetCA_CCB_CAI(
					CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeContactInfoAddBox);
		}
	}

	/**
	 * Returns the number of creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative contact info add boxes
	 */
	@Override
	public int countBygetCA_CCB_CAI(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CCB_CAI;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVECONTACTINFOADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CCB_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCA_CCB_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeContactInfoAddBox.CreativeApplicationId = ?";

	public CreativeContactInfoAddBoxPersistenceImpl() {
		setModelClass(CreativeContactInfoAddBox.class);

		setModelImplClass(CreativeContactInfoAddBoxImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeContactInfoAddBoxTable.INSTANCE);
	}

	/**
	 * Caches the creative contact info add box in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 */
	@Override
	public void cacheResult(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		entityCache.putResult(
			CreativeContactInfoAddBoxImpl.class,
			creativeContactInfoAddBox.getPrimaryKey(),
			creativeContactInfoAddBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative contact info add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBoxes the creative contact info add boxes
	 */
	@Override
	public void cacheResult(
		List<CreativeContactInfoAddBox> creativeContactInfoAddBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeContactInfoAddBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeContactInfoAddBox creativeContactInfoAddBox :
				creativeContactInfoAddBoxes) {

			if (entityCache.getResult(
					CreativeContactInfoAddBoxImpl.class,
					creativeContactInfoAddBox.getPrimaryKey()) == null) {

				cacheResult(creativeContactInfoAddBox);
			}
		}
	}

	/**
	 * Clears the cache for all creative contact info add boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeContactInfoAddBoxImpl.class);

		finderCache.clearCache(CreativeContactInfoAddBoxImpl.class);
	}

	/**
	 * Clears the cache for the creative contact info add box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		entityCache.removeResult(
			CreativeContactInfoAddBoxImpl.class, creativeContactInfoAddBox);
	}

	@Override
	public void clearCache(
		List<CreativeContactInfoAddBox> creativeContactInfoAddBoxes) {

		for (CreativeContactInfoAddBox creativeContactInfoAddBox :
				creativeContactInfoAddBoxes) {

			entityCache.removeResult(
				CreativeContactInfoAddBoxImpl.class, creativeContactInfoAddBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeContactInfoAddBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeContactInfoAddBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new creative contact info add box with the primary key. Does not add the creative contact info add box to the database.
	 *
	 * @param creativeContactBoxId the primary key for the new creative contact info add box
	 * @return the new creative contact info add box
	 */
	@Override
	public CreativeContactInfoAddBox create(long creativeContactBoxId) {
		CreativeContactInfoAddBox creativeContactInfoAddBox =
			new CreativeContactInfoAddBoxImpl();

		creativeContactInfoAddBox.setNew(true);
		creativeContactInfoAddBox.setPrimaryKey(creativeContactBoxId);

		creativeContactInfoAddBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeContactInfoAddBox;
	}

	/**
	 * Removes the creative contact info add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box that was removed
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox remove(long creativeContactBoxId)
		throws NoSuchCreativeContactInfoAddBoxException {

		return remove((Serializable)creativeContactBoxId);
	}

	/**
	 * Removes the creative contact info add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative contact info add box
	 * @return the creative contact info add box that was removed
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox remove(Serializable primaryKey)
		throws NoSuchCreativeContactInfoAddBoxException {

		Session session = null;

		try {
			session = openSession();

			CreativeContactInfoAddBox creativeContactInfoAddBox =
				(CreativeContactInfoAddBox)session.get(
					CreativeContactInfoAddBoxImpl.class, primaryKey);

			if (creativeContactInfoAddBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeContactInfoAddBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeContactInfoAddBox);
		}
		catch (NoSuchCreativeContactInfoAddBoxException noSuchEntityException) {
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
	protected CreativeContactInfoAddBox removeImpl(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeContactInfoAddBox)) {
				creativeContactInfoAddBox =
					(CreativeContactInfoAddBox)session.get(
						CreativeContactInfoAddBoxImpl.class,
						creativeContactInfoAddBox.getPrimaryKeyObj());
			}

			if (creativeContactInfoAddBox != null) {
				session.delete(creativeContactInfoAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeContactInfoAddBox != null) {
			clearCache(creativeContactInfoAddBox);
		}

		return creativeContactInfoAddBox;
	}

	@Override
	public CreativeContactInfoAddBox updateImpl(
		CreativeContactInfoAddBox creativeContactInfoAddBox) {

		boolean isNew = creativeContactInfoAddBox.isNew();

		if (!(creativeContactInfoAddBox instanceof
				CreativeContactInfoAddBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeContactInfoAddBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeContactInfoAddBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeContactInfoAddBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeContactInfoAddBox implementation " +
					creativeContactInfoAddBox.getClass());
		}

		CreativeContactInfoAddBoxModelImpl creativeContactInfoAddBoxModelImpl =
			(CreativeContactInfoAddBoxModelImpl)creativeContactInfoAddBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeContactInfoAddBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeContactInfoAddBox.setCreateDate(date);
			}
			else {
				creativeContactInfoAddBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeContactInfoAddBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeContactInfoAddBox.setModifiedDate(date);
			}
			else {
				creativeContactInfoAddBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeContactInfoAddBox);
			}
			else {
				creativeContactInfoAddBox =
					(CreativeContactInfoAddBox)session.merge(
						creativeContactInfoAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeContactInfoAddBoxImpl.class,
			creativeContactInfoAddBoxModelImpl, false, true);

		if (isNew) {
			creativeContactInfoAddBox.setNew(false);
		}

		creativeContactInfoAddBox.resetOriginalValues();

		return creativeContactInfoAddBox;
	}

	/**
	 * Returns the creative contact info add box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeContactInfoAddBoxException {

		CreativeContactInfoAddBox creativeContactInfoAddBox = fetchByPrimaryKey(
			primaryKey);

		if (creativeContactInfoAddBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeContactInfoAddBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeContactInfoAddBox;
	}

	/**
	 * Returns the creative contact info add box with the primary key or throws a <code>NoSuchCreativeContactInfoAddBoxException</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox findByPrimaryKey(long creativeContactBoxId)
		throws NoSuchCreativeContactInfoAddBoxException {

		return findByPrimaryKey((Serializable)creativeContactBoxId);
	}

	/**
	 * Returns the creative contact info add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box, or <code>null</code> if a creative contact info add box with the primary key could not be found
	 */
	@Override
	public CreativeContactInfoAddBox fetchByPrimaryKey(
		long creativeContactBoxId) {

		return fetchByPrimaryKey((Serializable)creativeContactBoxId);
	}

	/**
	 * Returns all the creative contact info add boxes.
	 *
	 * @return the creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative contact info add boxes
	 */
	@Override
	public List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeContactInfoAddBox> orderByComparator,
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

		List<CreativeContactInfoAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeContactInfoAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECONTACTINFOADDBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECONTACTINFOADDBOX;

				sql = sql.concat(
					CreativeContactInfoAddBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeContactInfoAddBox>)QueryUtil.list(
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
	 * Removes all the creative contact info add boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeContactInfoAddBox creativeContactInfoAddBox : findAll()) {
			remove(creativeContactInfoAddBox);
		}
	}

	/**
	 * Returns the number of creative contact info add boxes.
	 *
	 * @return the number of creative contact info add boxes
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
					_SQL_COUNT_CREATIVECONTACTINFOADDBOX);

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
		return "creativeContactBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECONTACTINFOADDBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeContactInfoAddBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative contact info add box persistence.
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

		_finderPathWithPaginationFindBygetCA_CCB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_CCB_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_CCB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_CCB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCA_CCB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_CCB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeContactInfoAddBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeContactInfoAddBoxUtil.setPersistence(null);

		entityCache.removeCache(CreativeContactInfoAddBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVECONTACTINFOADDBOX =
		"SELECT creativeContactInfoAddBox FROM CreativeContactInfoAddBox creativeContactInfoAddBox";

	private static final String _SQL_SELECT_CREATIVECONTACTINFOADDBOX_WHERE =
		"SELECT creativeContactInfoAddBox FROM CreativeContactInfoAddBox creativeContactInfoAddBox WHERE ";

	private static final String _SQL_COUNT_CREATIVECONTACTINFOADDBOX =
		"SELECT COUNT(creativeContactInfoAddBox) FROM CreativeContactInfoAddBox creativeContactInfoAddBox";

	private static final String _SQL_COUNT_CREATIVECONTACTINFOADDBOX_WHERE =
		"SELECT COUNT(creativeContactInfoAddBox) FROM CreativeContactInfoAddBox creativeContactInfoAddBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeContactInfoAddBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeContactInfoAddBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeContactInfoAddBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeContactInfoAddBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}